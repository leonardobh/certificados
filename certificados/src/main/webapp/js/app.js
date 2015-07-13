var certificadosApp = angular.module('certApp', [ 'ngRoute' ]);

// configure our routes
certificadosApp.config(function($routeProvider) {
	$routeProvider

	// route for the home page
	.when('/', {
		templateUrl : 'pages/home.html',
		controller : 'mainController'
	})

	// route for the about page
	.when('/pesquisa', {
		templateUrl : 'pages/pesquisa.html',
		controller : 'pesquisaController'
	})

});

