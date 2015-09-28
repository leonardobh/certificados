var certificadosApp = angular.module('certApp', [ 'ngRoute', 'pascalprecht.translate','ngResource' ]);

// configure our routes
certificadosApp.config(function($routeProvider,$translateProvider) {
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
	});
	
	$translateProvider.useStaticFilesLoader({
        prefix: '../certificados/i18n/locale-',
        suffix: '.json'
    });
	$translateProvider.preferredLanguage('pt_BR');
	
	
	
});

