var QG = prompt("Digite a quantidade de gols")
var QP = prompt("Digite a quantidade de passes certo")
var QPE = prompt("Digite a quantidade de passes errados")
TP=(QG*50)+(QP*10)+ (QPE* -5)

    if (TP<50){
                    
    alert("pessima partida!!!"); 
    }
           
    else if (TP >50 && TP<100){
                
    alert("partida ruim!!!"); 
    }
    
    else if (TP >100 && TP<150){ 
                
    alert("jogou bem!!!");
    }
    
    else if (TP >150 && TP<200){
                
    alert("otima partida!!!");
    }
    
    else if (TP >200){
                
    alert("jogou demais!!!");
    }
    
    alert("sua pontuação foi: "+ TP + " pontos!!!");

    





















