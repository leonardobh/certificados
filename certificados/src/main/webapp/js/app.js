var certificadosApp = angular.module('certApp', [ 'ngRoute' ]);

// configure our routes
certificadosApp.config(function($routeProvider) {
	$routeProvider

	.when('/', {
		templateUrl : 'pages/home.html',
		controller : 'mainController'
	})

	// route for the about page
	.when('/pesquisa', {
		templateUrl : 'pages/pesquisa.html',
		controller : 'pesquisaController'
	})

	// route for the about page
	.when('/cadastroEvento', {
		templateUrl : 'pages/cadastroEvento.html',
		controller : 'cadastroEventoController'
	})
	
});

