certificadosApp.controller('cadastroEventoController', function($scope,
		cadastroEventoService) {

	init();
	
	function init() {
		$scope.evento = {};
	}
	
	$scope.cadastrarNovoEvento = function() {
		
		console.log($scope.evento);
		$scope.evento = {};
	}

});