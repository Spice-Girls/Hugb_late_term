	function resetBoard() {
		$.ajax({
			url: "Restart",
			type: 'POST',
			//data: {'id': id},
			success: function(response) {
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
				console.log(response);
				$(("#"+id)).append(response);
			},
			error: function(response) {
				console.log("ERROR");
				console.log(response);
			}
		});
	}

