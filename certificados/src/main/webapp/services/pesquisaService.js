certificadosApp.factory('pesquisaService', function() {

	var doc = {};

	doc.certificados = function() {
		return [ {
			id : 1,
			descricao : "SIMPOSIO DE CIENCIAS GERENCIAIS"
		}, {
			id : 2,
			descricao : "SIMPOSIO DE CIENCIAS HUMANAS"
		}, {
			id : 3,
			descricao : "CURSO DE PYTHON - EXTENSÃO"
		}, {
			id : 4,
			descricao : "CURSO DE PHP - EXTENSÃO"
		} ];
	}

	return doc;
});