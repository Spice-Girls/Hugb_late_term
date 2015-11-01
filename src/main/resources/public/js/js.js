
	function sendClick(id) {
		$.ajax({
			url: "makeMove",
			type: 'POST',
			data: id,
			success: function(response) {
				console.log(response);
				if(id.legal) {
					$(("#"+id)).text = id.player;
				}
			},
			error: function(response) {
				console.log(response);
			}
		});
	}

