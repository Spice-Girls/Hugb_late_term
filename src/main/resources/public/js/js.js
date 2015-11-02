	function resetBoard() {
		$.ajax({
			url: "Restart",
			type: 'POST',
			//data: {'id': id},
			success: function(response) {
				response = JSON.parse(response);
				if(response) {
				   location.reload();
				}
			},
			error: function(response) {
				console.log("ERROR");
				console.log(response);
			}
		});
    } 
	function sendClick(id) {
		$.ajax({
			url: "MakeMove",
			type: 'POST',
			data: {'id': id},
			success: function(response) {
				response = JSON.parse(response);
					if(response.name != "n") {
						$(("#"+id)).text(response.player);
						alert(response.name);
						resetBoard();
					}else{
						$(("#"+id)).text(response.player);
					}
			},
			error: function(response) {
				console.log("ERROR");
				console.log(response);
			}
		});
	}

