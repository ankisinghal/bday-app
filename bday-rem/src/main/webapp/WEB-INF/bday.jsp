    <!DOCTYPE html>
    <html>
    <head>
    <title>Bootstrap 101 Template</title>
    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/bday.js"></script>
    <script>
     $(document).ready(init);
     function init(){
    		//alert ("Document loaded");
    		$.getJSON("getEmployee.do", loadEmployeeData );
    		
    	}

    function loadEmployeeData (data){
    		$.each(data,
    	    		function(index,objValue){
	    		var name=objValue['name'];
	    		var spouseName=objValue['spouseName'];
	    		var bday =objValue['bday'];
	    		var annivdate=objValue['annivDate'];
	    		var joiningdate=objValue['joiningDate'];
	    		var row="<tr><td></td><td>"+ name+"</td><td>"+spouseName+"</td><td>"+bday+"</td><td>"+annivdate+"</td><td>"+joiningdate+"</td><tr>";
	    		$(row).appendTo('#employees');
    		});
    	}


       </script>
    </head>
    <body>
    
    <div class="page-header">
    <h1>Birthday Notifier <small>Webapp to manage b'day</small></h1>
    </div>
    
    <div id="bday" class="container">
	<input id="search" type="text" placeholder="Search" ></input> <button type="button" class="btn">Search</button>"
   <table id="employees" class="table table-striped table-condensed table-bordered" >
    <caption>...</caption>
    <thead>
    <tr>
    <th>Photo </th>
    <th>Name </th>
    <th>Spouse Name </th>
    <th>Birth Date</th>
    <th>Anniversary Date </th>
    <th>Joining Date </th>
    <th>Actions </th>
    </tr>
    </thead>
    <tbody id="employees">
    
    </tbody>
    </table>
    </div>
    
    </body>
    </html>

