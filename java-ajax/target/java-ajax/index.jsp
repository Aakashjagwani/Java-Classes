
<html>
<head>
<meta charset="utf-8">
<title>Java Servlet JSON</title>
<script src="js/jquery.js"></script>
 
<!-- bootstrap just to have good looking page -->
<link href="bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet" />
 
<!-- we code these -->
<script src="js/myfunctions.js"></script>
 
</head>
 
<body>
 
    <h1 style="text-align:center">Java Servlet Send & Receive JSON<br></h1> 
 
    <!-- article inputs -->
    <div class="article" style="margin:10px;">
        <div class="input-prepend">
            <span class="add-on">Title</span>
            <input class="span4" id="title" name="title" type="text" placeholder="Article Title...">
        </div>
        <br/>
        <div class="input-prepend">
            <span class="add-on">URL</span>
            <input class="span4" id="url" name="url" type="text" placeholder="http://...">
        </div>
        <br/>
        <div class="input-prepend">
            <span class="add-on">Categories</span>
            <input class="span2" id="categories" name="categories" type="text" placeholder="category1;category2;...">
        </div>
        <br/>
        <div class="input-prepend">
            <span class="add-on">Tags</span>
            <input class="span2" id="tags" name="tags" type="text" placeholder="tag1;tag2;...">
        </div>
        <p>
            <button class="btn btn-primary" type="button" onclick="sendAjax()">Add</button>
        </p>
    </div>
 
    <div style="width:700px;padding:20px;S">
        <h5 style="text-align:center"><i style="color:#ccc"><small>Articles</small></i></h5>
 
        <table id="added-articles" class="table">
            <tr>
                <th>Title</th>
                <th>Categories</th>
                <th>Tags</th>
            </tr>
        </table>
    </div>
</body> 
</html>