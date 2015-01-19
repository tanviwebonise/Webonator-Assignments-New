$(document).ready(function(){
      $(".divbox").click(function(){
            if($('input:radio:checked').length > 0){
                $("#warning").hide();
                if($(this).hasClass("redbox"))
                {
                    $("#warning").html("Already applied Red color");
                    $("#warning").show();
                    return false;
                }
                if($(this).hasClass("bluebox"))
                {
                    $("#warning").html("Already applied Blue color");
                    $("#warning").show();
                    return false;
                }
                if($(this).hasClass("greenbox"))
                {
                    $("#warning").html("Already applied Green color");
                    $("#warning").show();
                    return false;
                }
                var x = $('input:radio:checked').val();
                
                if(x==1)
                {
                    $(this).removeClass("defaultbox");
                    $(this).addClass("redbox");
                    return false;
                }
                if (x==2) 
                {
                    $(this).removeClass("defaultbox");
                    $(this).addClass("bluebox");
                    return  false;
                }
                if (x==3) 
                {
                    $(this).removeClass("defaultbox");
                    $(this).addClass("greenbox");
                    return  false;
                }
                
            }else{
                $("#warning").html("Please select a color before clicking on boxes.");
                $("#warning").show();
            }
        });

    $("#reset").click(function(){
        $(".divbox").removeClass("redbox bluebox greenbox");
        $(".divbox").addClass("defaultbox");
        $("#warning").hide();
        
            for(var i=1; i<=9; i++)
            {
                $("div.divbox."+i).appendTo("div.outerbox");
            }
        
        

    });

     $("#randomize").click(function(){
        
        $("div.outerbox div").sort(function(){
        return Math.random()*10 > 5 ? 1 : -1;
        }).each(function(){
         var $t = $(this);
        var color = $t.attr("class");
        $t.appendTo( $t.parent() );
        });    

    });
});