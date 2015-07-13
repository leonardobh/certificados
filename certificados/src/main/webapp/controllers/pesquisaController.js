certificadosApp.controller('pesquisaController', function($scope, pesquisaService) {
	
	$scope.message = 'pagina de pesquisa te testes ';
	
	$scope.certificados = pesquisaService.certificados();
});