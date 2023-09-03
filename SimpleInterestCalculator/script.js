function compute()
{
    
    var principal =  document.getElementById("principal").value;
    var rate= document.getElementById("rate").value;
    var years = document.getElementById("years").value;

    var parPrincipal = parseInt(principal);
    var parRate = parseFloat(rate);
    var parYears = parse(years);

    if(parPrincipal == 0 || parPrincipal < 0){
        alert("Enter a positive number");
        document.getElementById("principal").focus();
    }    
    else{
    var interest = parPrincipal * parYears * (parRate / 100);
    var parInterest = parseFloat(interest);
    var amount = parPrincipal + parInterest;
    var result = document.getElementById("result");

    var date = new Date();
    var NYears = parYears + date.getFullYear();
    
    
    result.innerHTML = "If you deposit $" + "<mark>" + principal + "</mark>" + ",\<br\> at an interest rate of " + "<mark>" + rate + "%" + "</mark>" + "\<br\> You will receive an amount of $" + "<mark>" + amount + "</mark>" + ",\<br\> in the year " + "<mark>" + year + "</mark>" + "\<br\>";
    }
    


}

function updateRate(){

    var rateval = document.getElementById("rate").value;
    document.getElementById("rate_val").innerText = rateval;
    var date = getFullYear();
 
}
        
function alertDate(){


}
