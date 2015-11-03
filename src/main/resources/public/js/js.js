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

	function resetBoard2() {
		$.ajax({
			url: "Restart",
			type: 'POST',
			//data: {'id': id},
			success: function(response) {
				response = JSON.parse(response);
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
            async: false,
			data: {'id': id},
			success: function(response) {
				response = JSON.parse(response);
					if(response.name != "n") {
						$(("#"+id)).text(response.player);
						$( "#messageBox" ).html(response.name + " Just Won");
						$(".gameButton").html(function(){
							$(this).prop('onclick', null).off('click');
						});
					}else{
						$(("#"+id)).text(response.player);
						$( "#messageBox" ).html(response.player + " Just Moved");
					}
			},
			error: function(response) {
				console.log("ERROR");
				console.log(response);
			}
		});
	}

	resetBoard2();
