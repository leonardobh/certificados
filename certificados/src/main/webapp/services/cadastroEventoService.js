certificadosApp.factory('cadastroEventoService', function($resource) {

	return $resource('api/eventos/:id',{id: '@id'}, {
		update : {
			method : 'PUT'
		}
	});
	
});