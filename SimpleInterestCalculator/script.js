function compute()
{
    
    var principal = document.getElementById("principal").value;
    var rate= document.getElementById("rate").value;
    var years = document.getElementById("years").value;

    var parPrincipal = principal;
    var parRate = rate;
    var parYears = years;


    if(parPrincipal == 0 || parPrincipal < 0){
        alert("Enter a positive number");
        document.getElementById("principal").focus();
    }    
    else{
    var interest = parPrincipal * parYears * (parRate / 100);
    var parInterest = parseFloat(interest);
    var amount = parseInt(parPrincipal) + parInterest;
    var result = document.getElementById("result");

    var date = new Date();
    var NYears = parYears + date.getFullYear();
    
    
    result.innerHTML = "If you deposit $" + "<mark>" + parseInt(principal) + "</mark>" + ",\<br\> at an interest rate of " + "<mark>" + parseFloat(rate) + "%" + "</mark>" + "\<br\> You will receive an amount of $" + "<mark>" + amount + "</mark>" + ",\<br\> in the year " + "<mark>" + NYears + "</mark>" + "\<br\>";
    }
    


}

function updateRate(){

    var rateval = document.getElementById("rate").value;
    document.getElementById("rate_val").innerText = rateval;
    var date = getFullYear();
 
}
        
        
function alertDate(){


}
