
$(function () {
            
            
            var canvas = document.getElementById("myCanvas");
            var ctx = canvas.getContext("2d");
            ctx.moveTo(320, 0);
            ctx.lineTo(320, 650);
            ctx.stroke();
            ctx.moveTo(0, 320);
            ctx.lineTo(650, 320);
            ctx.stroke();

                $("#submitButton").click(function ()
		 {

                    var line_equation = $("#equationTextBox").val();
                    var step = $("#stepTextBox").val();
                    var inbound = $("#inboundTextBox").val();
                    var outbound = $("#outboundTextBox").val();

                    if (line_equation == "" || line_equation == null) 
		    {
                        alert("Invalid line equation");
                    }
                    else
		    {
                        //var re1 = '((?:[a-z][a-z0-9_]*))';	// Variable Name 1
                       
                        var regx3 = '(\\d+)';	// Integer Number 1
                        var regx4 = '((?:[a-z][a-z0-9_]*))';	// Variable Name 2
                        var regx5 = '.*?';	// expression
                        var regx6 = '(\\d+)';	// Integer Number 2

                        var new_regx = new RegExp(regx3 + regx4 + regx5 + regx6, ["i"]);
                        var m = new_regx.exec(line_equation);
                        if (m != null) 
			{
                            
                            var int1 = parseInt(m[1]);
                            var var2 = m[2];
                            var int2 = parseInt(m[3]);
                           
                        }
                        else
                            alert("Equation not in proper format");
                    }

                    if (step == "" || step == null || isNaN(step))
                    {
                        alert("Invalid step");
                    }

                    if (inbound == "" || inbound == null || isNaN(inbound)) 
		    {
                        alert("Invalid inbound");
                    }

                    if (outbound == "" || outbound == null || isNaN(outbound)) 
		    {
                        alert("Invalid outbound");
                    }

                    var graph = {
                        var_step : step,
                        var_inbound: inbound,
                        var_outbound: outbound
                    }


                    var line = {}

                    line.__proto__ = graph;

                   

                        var x_coordinates = [];
                        var y_coordinates = [];
			//var s=parseInt(step);
                        var count = 0;
                        var i = line.var_inbound;
                        while (i <= line.var_outbound)
			 {
                            
                            var y = ((int1 * i) + int2);
                            
                            x_coordinates[count] = i;
                            y_coordinates[count] = (-y);
                            
                            i = i + step;
                            
                            count = count + 1;
                            

                        }
                        

                        ctx.moveTo(320, 320);
                        for (var i = 0; i < x_coordinates.length; i++)
                        {
                            ctx.lineTo(parseInt(x_coordinates[i])+320, parseInt(y_coordinates[i])+320);
                            ctx.stroke();
                        }

                    


                });


               





            });

    
