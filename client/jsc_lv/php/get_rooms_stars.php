<?php
//include_once "auth.php";     
  //connection information
  $host = "localhost";
  $user = "chy";
  $password = "137807";
  $database = "cc";
  $gid= "100004";//"$_GET["gid"]) ;
  $gid=$_GET["gid"];
  $gids= "100004";//"$_GET["gid"]) ;
  $gids=$_GET["gids"];
    //make connection
  $server = mysql_connect($host, $user, $password);
  $connection = mysql_select_db($database, $server);
     
    //query the database
  $query = mysql_query("set names utf8");
   
  	$query = mysql_query("SELECT mcc_session.* FROM mcc_session, yrecomand_stars where yrecomand_stars.room_id=mcc_session.id limit 10" );
  
    
    //start json object
    $json = "["; 
     
    //loop through and return results
  for ($x = 0; $x < mysql_num_rows($query); $x++) {
    $row = mysql_fetch_assoc($query);
         
        //continue json object
    $json .= "{\"session_id\":\""     . $row["session_id"] 
    . "\",\"session_name\":\""     . $row["session_name"]  
    . "\",\"id\":\""     . $row["id"] . "\"" 
    . ",\"online\":"     . $row["send_invitation"] . "" 
    . ",\"avatar\":\""     . $row["session_key"] . "\"" 
    . ",\"password\":\""     . $row["password"] . "\"" 
    . ",\"description\":\""     . str_replace("\"","\\\"",$row["description"])  . "\"" 
    . ",\"maxofconf\":"  . $row["max_video_in_conf"] 
    . "}" ;
         
        //add comma if not last row, closing brackets if is
        if ($x < mysql_num_rows($query) -1)
            $json .= ",";
        //else
        //    $json .= "]";
  }
      $json .= "]";
    //return JSON with GET for JSONP callback
    $response = $_GET["callback"] . $json;
    echo $response;
 
    //close connection
    mysql_close($server);
 
?>
