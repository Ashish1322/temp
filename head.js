var dom = document.getElementsByTagName("div");
var temp_id;
function update_color(id)
{
    if(id!=-1)
    {
     
        if(document.getElementById(id).style.backgroundColor=="green")
        {
            console.log("hi")
            document.getElementById(id).style= "background-color: red"  ;
        }
        else{
        document.getElementById(id).style = "background-color: green";}
    }
}
function update_id(id)
{
    var up = -1
    var left = -1;
    var right = -1
    var bottom = -1;
    if(id==1)
    {
        right = id+1;
        bottom = id+27;
    }
    else if(id==27)
    {
        left = id-1;
        bottom = id+27;
    }
    else if(id==810)
    {
        up = id-27;
        right = id+1;
    }
    else if(id==837)
    {
        left = id-1;
        up = id-27;
    }
    else if(id<27 && id>1)
    {
        left = id-1;
        bottom = id+27;
        right = id+1;

    }
    else if( id>757 && id<783)
    {
        up = id-27;
        left = id-1;
        right = id+1;
    }
    else if (id%27==0)
    {
        left = id-1;
        up = id-27;
        bottom = id+27;
    }
    else if(id%27==1)
    {
        right = id+1;
        up = id-27;
        bottom = id+27;
    }
    else
    {
        right = id+1;
        up = id-27;
        bottom = id+27;
        left = id-1;
    }
 
    update_color(up)
    update_color(left)
    update_color(right)
    update_color(bottom)
    
}

for(var i = 0 ; i <dom.length ; i++)
{
    if(dom[i].innerText=="01")
    {
        var num = dom[i].id;
    
        console.log(num)
        document.getElementById(num).style = "background-color:blue";
        num = parseInt(num);
        update_id(num);
    }
}


// window.addEventListener()
// document.getElementById('testForm').addEventListener('onclick',call);