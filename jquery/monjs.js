jQuery(document).ready(function(){
	$.ajax({
		url: 'http://localhost:8080/Spring-cours5-test/users',
		type: 'GET',
		datatype: 'json',
		success: function(data, statut){
			$.each(data, function(key, value){
				var li = document.createElement('li');
				li.innerHTML = value.nom + ' ' + value.prenom + ' ' + value.age + ' ans.';
				$('#listU').append(li);
			});
		}
	});
});

