
certificadosApp.controller('cadastroEventoController', function($scope,
		cadastroEventoService) {

	init();
	
	function init() {
		$scope.evento = {};
		$scope.eventos = cadastroEventoService.query();
	}	
	
	$scope.cadastrarNovoEvento = function() {
		
		if(typeof $scope.evento.id === 'undefined') {
			cadastroEventoService.save($scope.evento,function() {
				$scope.obterEventos();
			});
		}else {
			$scope.evento.$update(function() {
				$scope.obterEventos();
			});
		}
		
		$scope.evento = {};
	}
	
	$scope.remover = function(evento) {
		evento.$delete(function() {
			$scope.obterEventos();
		})
	}
	
	$scope.editar = function(evento) {
		$scope.evento = evento;
	}
	
	$scope.obterEventos = function() {
		$scope.eventos = cadastroEventoService.query();
	}
	

});

