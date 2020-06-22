var myData = {
  labels : ["第1周","第2周","第3周","第5周","第5周","第6周","第7周"],
  datasets : [
    {
      fillColor : "rgba(255,58,58,0.15)",
      strokeColor : "rgba(214,123,71,0.5)",
      pointColor : "rgba(218,94,22,1)",
      pointStrokeColor : "#fff",
      data : [60,70,55,81,56,80,60]
    },
    {
      fillColor : "rgba(52,77,255,0.6)",
      strokeColor : "rgba(15,40,220,0.6)",
      pointColor : "rgba(15,40,220,1)",
      pointStrokeColor : "#fff",
      data : [54,50,60,42,60,50,90]
    }
  ]
}

new Chart(document.getElementById("canvas").getContext("2d")).Line(myData)