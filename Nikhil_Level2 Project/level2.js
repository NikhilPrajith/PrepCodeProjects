function initialize() {
				num1Output = document.getElementById("num1");
				num2Output = document.getElementById("num2");
				num3Output = document.getElementById("num3");
				num1i = 0;
				num2i = 0;
				num3i = 0;
                set = "";
				turn = 7;
				score = 0;
				document.getElementById("turns").innerHTML = turn;
				code1=Math.floor(Math.random() * 9) + 1;
				code2=Math.floor(Math.random() * 9) + 1;
				code3=Math.floor(Math.random() * 9) + 1;
				correct1=false;
				correct2=false;
				correct3=false;
				rangeofcode=(code1*100)+(code2*10)+code3;
				roundtrack=document.getElementById("round");
				roundnum=1;
				i = 0;
				txt= 'ROUND '+roundnum;
				speed = 220;
				sec=30;
				guess=0;
				
			}

			function initialize2() {
				num1Output = document.getElementById("num1");
				num2Output = document.getElementById("num2");
				num3Output = document.getElementById("num3");
				num1i = 0;
				num2i = 0;
				num3i = 0;
                set = "";
				turn = turn+7;
				document.getElementById("turns").innerHTML = turn;
				code1=Math.floor(Math.random() * 9) + 1;
				code2=Math.floor(Math.random() * 9) + 1;
				code3=Math.floor(Math.random() * 9) + 1;
				correct1=false;
				correct2=false;
				correct3=false;
				rangeofcode=(code1*100)+(code2*10)+code3;
				i=0;
			}

			function start() {
				set = setInterval("quick();", 40);  
			}

			function quick() {
				if (num1i < 9) {
					num1i = num1i+1;
					display();
                    if (num1i == 9) {
                        num1i = "-";
                        display();
                    }
				}
				else if (num2i < 9) {
					num2i = num2i+1;
					display();
                    if (num2i == 9) {
                        num2i = "-";
                        display();
                    }
				}
				else if (num3i < 9) {
					num3i = num3i+1;
					display();
                    if (num3i == 9) {
                        num3i = "-";
                        display();
                        clearInterval(set);
                    }
				}
				else {
					clearInterval(set);
					display();
				}
			}

			function digit(num){
				if(num1i=="-"){
					num1i=num;
					display();
					if(num1i==code1){
						correct1=true;
					}
					
				}
				else if(num2i=="-"){
					num2i=num;
					display();
					if(num2i==code2){
						correct2=true;
					}
				}
				else if(num3i=="-"){
					num3i=num;
					display();
					if(num3i==code3){
						correct3=true;
					}
				}
				check();
			}

			function clear(){
				num1i="-";
				display();
				num2i="-";
				display();
				num3i="-";
				display();
			}

			function range(){
				var check= (num1i*100)+(num2i*10)+num3i;
				var difference= Math.round(Math.abs(check-rangeofcode));
				if (difference <= 5){
					document.getElementById("range").innerHTML="Very Close; less than 5 away";
					var change=5;
				}
				else if (difference <= 10){
					document.getElementById("range").innerHTML="So Close; less than ten away";
					var change=10;
				}
				else if (difference <=20){
					document.getElementById("range").innerHTML="So Close; less than 20 away";
					var change=20;
				}
				else if (difference <=30){
					document.getElementById("range").innerHTML="So Close; less than 30 away";
					var change=30;
				}
				else if (difference <=50){
					document.getElementById("range").innerHTML="Close; less than 50 away";
					var change=50;
				}
				else if (difference <=100){
					document.getElementById("range").innerHTML="Fairway; less than 100 away";
					var change = 100;
				}
				else if (difference <=200){
					document.getElementById("range").innerHTML="Fairway; less than 200 away";
					var change=200;
				}
				else if (difference<=300){
					document.getElementById("range").innerHTML="Fairway; less than 300 away";
					var change =300;
				}
				else if (difference<=400){
					document.getElementById("range").innerHTML="Midway; less than 400 away";
					var change= 400;
				}
				else if (difference <=500){
					document.getElementById("range").innerHTML="Midway; less than 500 away";
					var change=500;
				}
				else if (difference <=600) {
					document.getElementById("range").innerHTML="Far; less than 600 away";
					var change= 600;
				}
				else if (difference <=700) {
					document.getElementById("range").innerHTML="Very Far, less than 700 away";
					var change=700;
				}
				else if (difference <=800) {
					document.getElementById("range").innerHTML="Very Far, less than 800 away";
					var change=800;
				}
				else if (difference <=900) {
					document.getElementById("range").innerHTML="Super Far, less than 900 away";
					var change=900;
				}
				else if (difference >900) {
					document.getElementById("range").innerHTML="Super Far, more than 900 away";
					var change= "900+";
				}
				if(guess>=8){
					guess=0
					document.getElementById("log").innerHTML="";
				}
				document.getElementById("log").innerHTML += "<br />"+ "Your Guess Last Turn Was " + "'"+ "<b>" +check+ "</b>" + "'" + "(" + change + ")";
			}

			function check() {
				if(num1i!=="-" & num2i !=="-" & num3i!=="-"){
					guess=guess+1;
					if(correct1==true & correct2==true & correct3==true){
						score = score + turn;
						document.getElementById("range").innerHTML = "";
						document.getElementById("points").innerHTML = score;
						initialize2();
						displaycode();
						start();
						roundnum=roundnum+1;
						i=0;
						roundtrack.innerHTML="";
						roundset();
						document.getElementById("log").innerHTML="";
						document.getElementById("log").innerHTML="You Got Round " +(roundnum-1) +" correct";
												
					}
					else{	
						if(turn==0){
							turn=0;
						}else{
							turn = turn - 1;
						}
						document.getElementById("turns").innerHTML = turn;
						range();
						clear();

					}
					if (turn == 0) {
						score == 0;
						document.getElementById("points").innerHTML = score;
						document.getElementById("lock").style.display = "block";
						document.getElementById("container").style.display = "none";
						document.getElementById("log").style.display="none";
					}
				}
			}

			function display() {
				num1Output.innerHTML = num1i;
				num2Output.innerHTML = num2i;
				num3Output.innerHTML = num3i;
			}

			function displaycode(){
				document.getElementById("code").innerHTML=rangeofcode;
			}
			function delete2(){
				num1i="-";
				num2i="-";
				num3i="-";
				display();
			}
			function roundset(){
				txt ='ROUND '+roundnum;
			    if (i < txt.length) {
					document.getElementById("round").innerHTML += txt.charAt(i);
					i++;
					setTimeout(roundset, speed);
				}
			}
			function themeDark(){
				if(document.body.style.backgroundColor == "black")
				{
					document.getElementById("code").style.color="black";
					document.getElementById("slideshow").style.color="black";
					document.body.style.backgroundColor = "white";
					document.getElementById("imput").style.color="black";
					document.getElementById("scores").style.color="black";
					document.getElementById("turns2").style.color="black";
					document.getElementById("pics").style.visibility="hidden";	
					document.getElementById("range").style.color="black";
					document.getElementById("timer").style.color="black";
					
					
				}
				else{
					document.getElementById("code").style.color="black";
					document.getElementById("slideshow").style.color="white";
					document.body.style.backgroundColor = "black";
					document.getElementById("imput").style.color="white";
					document.getElementById("scores").style.color="red";
					document.getElementById("turns2").style.color="white";
					document.getElementById("pics").style.visibility="visible";
					document.getElementById("range").style.color="white";
					document.getElementById("timer").style.color="white";
					
					
					}
					
			}
			
	