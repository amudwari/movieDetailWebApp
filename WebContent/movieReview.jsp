<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>

<header style="height: 30px;background-color: yellow;">
</header>
<div class= "container">
<hr/>

           <label> Name:: ${data.name}</label>
             <hr/>
            <label
            >Year::  ${data.year}</label>
              <hr/>
             <label>Description:: ${data.description}</label>
               <hr/>
              <label>Director:: ${data.director}</label>
                <hr/>
               <label>Duration:: ${data.duration}</label>
                 <hr/>
                <label>Poster::  ${data.poster}</label>
                 <hr/>
                <label>Rating::  ${data.rating}</label>
</div>
</body>
</html>