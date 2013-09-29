



<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
 <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
 
 <meta name="ROBOTS" content="NOARCHIVE">
 
 <link rel="icon" type="image/vnd.microsoft.icon" href="https://ssl.gstatic.com/codesite/ph/images/phosting.ico">
 
 
 <script type="text/javascript">
 
 
 
 
 var codesite_token = "Xgkj5kVxZxgmT0gmVd8iD_Iar-c:1380473672537";
 
 
 var CS_env = {"token":"Xgkj5kVxZxgmT0gmVd8iD_Iar-c:1380473672537","profileUrl":"/u/gravitydevelopment/","domainName":null,"assetHostPath":"https://ssl.gstatic.com/codesite/ph","projectHomeUrl":"/p/gravity-jio","assetVersionPath":"https://ssl.gstatic.com/codesite/ph/15490321151412058579","loggedInUserEmail":"gravitydevelopment@gmail.com","projectName":"gravity-jio","relativeBaseUrl":""};
 var _gaq = _gaq || [];
 _gaq.push(
 ['siteTracker._setAccount', 'UA-18071-1'],
 ['siteTracker._trackPageview']);
 
 (function() {
 var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
 ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
 (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(ga);
 })();
 
 </script>
 
 
 <title>jioLib.java - 
 gravity-jio -
 
 
 A library that simplified the java i/o function - Google Project Hosting
 </title>
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/15490321151412058579/css/core.css">
 
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/15490321151412058579/css/ph_detail.css" >
 
 
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/15490321151412058579/css/d_sb.css" >
 
 
 
<!--[if IE]>
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/15490321151412058579/css/d_ie.css" >
<![endif]-->
 <style type="text/css">
 .menuIcon.off { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -42px }
 .menuIcon.on { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -28px }
 .menuIcon.down { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 0; }
 
 
 
  tr.inline_comment {
 background: #fff;
 vertical-align: top;
 }
 div.draft, div.published {
 padding: .3em;
 border: 1px solid #999; 
 margin-bottom: .1em;
 font-family: arial, sans-serif;
 max-width: 60em;
 }
 div.draft {
 background: #ffa;
 } 
 div.published {
 background: #e5ecf9;
 }
 div.published .body, div.draft .body {
 padding: .5em .1em .1em .1em;
 max-width: 60em;
 white-space: pre-wrap;
 white-space: -moz-pre-wrap;
 white-space: -pre-wrap;
 white-space: -o-pre-wrap;
 word-wrap: break-word;
 font-size: 1em;
 }
 div.draft .actions {
 margin-left: 1em;
 font-size: 90%;
 }
 div.draft form {
 padding: .5em .5em .5em 0;
 }
 div.draft textarea, div.published textarea {
 width: 95%;
 height: 10em;
 font-family: arial, sans-serif;
 margin-bottom: .5em;
 }

 
 .nocursor, .nocursor td, .cursor_hidden, .cursor_hidden td {
 background-color: white;
 height: 2px;
 }
 .cursor, .cursor td {
 background-color: darkblue;
 height: 2px;
 display: '';
 }
 
 
.list {
 border: 1px solid white;
 border-bottom: 0;
}

 
 </style>
</head>
<body class="t4">
<script type="text/javascript">
 window.___gcfg = {lang: 'en'};
 (function() 
 {var po = document.createElement("script");
 po.type = "text/javascript"; po.async = true;po.src = "https://apis.google.com/js/plusone.js";
 var s = document.getElementsByTagName("script")[0];
 s.parentNode.insertBefore(po, s);
 })();
</script>
<div class="headbg">

 <div id="gaia">
 

 <span>
 
 
 
 <b>gravitydevelopment@gmail.com</b>
 
 
 | <a href="/u/gravitydevelopment/" id="projects-dropdown" onclick="return false;"
 ><u>My favorites</u> <small>&#9660;</small></a>
 | <a href="/u/gravitydevelopment/" onclick="_CS_click('/gb/ph/profile');"
 title="Profile, Updates, and Settings"
 ><u>Profile</u></a>
 | <a href="https://www.google.com/accounts/Logout?continue=https%3A%2F%2Fcode.google.com%2Fp%2Fgravity-jio%2Fsource%2Fbrowse%2Fsrc%2Fgravity%2FjioLib.java" 
 onclick="_CS_click('/gb/ph/signout');"
 ><u>Sign out</u></a>
 
 </span>

 </div>

 <div class="gbh" style="left: 0pt;"></div>
 <div class="gbh" style="right: 0pt;"></div>
 
 
 <div style="height: 1px"></div>
<!--[if lte IE 7]>
<div style="text-align:center;">
Your version of Internet Explorer is not supported. Try a browser that
contributes to open source, such as <a href="http://www.firefox.com">Firefox</a>,
<a href="http://www.google.com/chrome">Google Chrome</a>, or
<a href="http://code.google.com/chrome/chromeframe/">Google Chrome Frame</a>.
</div>
<![endif]-->



 <table style="padding:0px; margin: 0px 0px 10px 0px; width:100%" cellpadding="0" cellspacing="0"
 itemscope itemtype="http://schema.org/CreativeWork">
 <tr style="height: 58px;">
 
 
 
 <td id="plogo">
 <link itemprop="url" href="/p/gravity-jio">
 <a href="/p/gravity-jio/">
 
 <img src="https://ssl.gstatic.com/codesite/ph/images/defaultlogo.png" alt="Logo" itemprop="image">
 
 </a>
 </td>
 
 <td style="padding-left: 0.5em">
 
 <div id="pname">
 <a href="/p/gravity-jio/"><span itemprop="name">gravity-jio</span></a>
 </div>
 
 <div id="psum">
 <a id="project_summary_link"
 href="/p/gravity-jio/"><span itemprop="description">A library that simplified the java i/o function</span></a>
 
 </div>
 
 
 </td>
 <td style="white-space:nowrap;text-align:right; vertical-align:bottom;">
 
 <form action="/hosting/search">
 <input size="30" name="q" value="" type="text">
 
 <input type="submit" name="projectsearch" value="Search projects" >
 </form>
 
 </tr>
 </table>

</div>

 
<div id="mt" class="gtb"> 
 <a href="/p/gravity-jio/" class="tab ">Project&nbsp;Home</a>
 
 
 
 
 <a href="/p/gravity-jio/downloads/list" class="tab ">Downloads</a>
 
 
 
 
 
 <a href="/p/gravity-jio/w/list" class="tab ">Wiki</a>
 
 
 
 
 
 <a href="/p/gravity-jio/issues/list"
 class="tab ">Issues</a>
 
 
 
 
 
 <a href="/p/gravity-jio/source/checkout"
 class="tab active">Source</a>
 
 
 
 
 
 <a href="/p/gravity-jio/admin"
 class="tab inactive">Administer</a>
 
 
 
 
 <div class=gtbc></div>
</div>
<table cellspacing="0" cellpadding="0" width="100%" align="center" border="0" class="st">
 <tr>
 
 
 
 
 
 
 <td class="subt">
 <div class="st2">
 <div class="isf">
 
 


 <span class="inst1"><a href="/p/gravity-jio/source/checkout">Checkout</a></span> &nbsp;
 <span class="inst2"><a href="/p/gravity-jio/source/browse/">Browse</a></span> &nbsp;
 <span class="inst3"><a href="/p/gravity-jio/source/list">Changes</a></span> &nbsp;
 
 
 
 
 <a href="/p/gravity-jio/issues/entry?show=review&former=sourcelist">Request code review</a>
 
 
 
 </form>
 <script type="text/javascript">
 
 function codesearchQuery(form) {
 var query = document.getElementById('q').value;
 if (query) { form.action += '%20' + query; }
 }
 </script>
 </div>
</div>

 </td>
 
 
 
 <td align="right" valign="top" class="bevel-right"></td>
 </tr>
</table>


<script type="text/javascript">
 var cancelBubble = false;
 function _go(url) { document.location = url; }
</script>
<div id="maincol"
 
>

 




<div class="expand">
<div id="colcontrol">
<style type="text/css">
 #file_flipper { white-space: nowrap; padding-right: 2em; }
 #file_flipper.hidden { display: none; }
 #file_flipper .pagelink { color: #0000CC; text-decoration: underline; }
 #file_flipper #visiblefiles { padding-left: 0.5em; padding-right: 0.5em; }
</style>
<table id="nav_and_rev" class="list"
 cellpadding="0" cellspacing="0" width="100%">
 <tr>
 
 <td nowrap="nowrap" class="src_crumbs src_nav" width="33%">
 <strong class="src_nav">Source path:&nbsp;</strong>
 <span id="crumb_root">
 
 <a href="/p/gravity-jio/source/browse/">svn</a>/&nbsp;</span>
 <span id="crumb_links" class="ifClosed"><a href="/p/gravity-jio/source/browse/src/">src</a><span class="sp">/&nbsp;</span><a href="/p/gravity-jio/source/browse/src/gravity/">gravity</a><span class="sp">/&nbsp;</span>jioLib.java</span>
 
 


 </td>
 
 
 <td nowrap="nowrap" width="33%" align="center">
 <a href="/p/gravity-jio/source/browse/src/gravity/jioLib.java?edit=1"
 ><img src="https://ssl.gstatic.com/codesite/ph/images/pencil-y14.png"
 class="edit_icon">Edit file</a>
 </td>
 
 
 <td nowrap="nowrap" width="33%" align="right">
 <table cellpadding="0" cellspacing="0" style="font-size: 100%"><tr>
 
 
 <td class="flipper"><b>r14</b></td>
 
 </tr></table>
 </td> 
 </tr>
</table>

<div class="fc">
 
 
 
<style type="text/css">
.undermouse span {
 background-image: url(https://ssl.gstatic.com/codesite/ph/images/comments.gif); }
</style>
<table class="opened" id="review_comment_area"
onmouseout="gutterOut()"><tr>
<td id="nums">
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
<pre><table width="100%" id="nums_table_0"><tr id="gr_svn14_1"

 onmouseover="gutterOver(1)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',1);">&nbsp;</span
></td><td id="1"><a href="#1">1</a></td></tr
><tr id="gr_svn14_2"

 onmouseover="gutterOver(2)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',2);">&nbsp;</span
></td><td id="2"><a href="#2">2</a></td></tr
><tr id="gr_svn14_3"

 onmouseover="gutterOver(3)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',3);">&nbsp;</span
></td><td id="3"><a href="#3">3</a></td></tr
><tr id="gr_svn14_4"

 onmouseover="gutterOver(4)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',4);">&nbsp;</span
></td><td id="4"><a href="#4">4</a></td></tr
><tr id="gr_svn14_5"

 onmouseover="gutterOver(5)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',5);">&nbsp;</span
></td><td id="5"><a href="#5">5</a></td></tr
><tr id="gr_svn14_6"

 onmouseover="gutterOver(6)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',6);">&nbsp;</span
></td><td id="6"><a href="#6">6</a></td></tr
><tr id="gr_svn14_7"

 onmouseover="gutterOver(7)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',7);">&nbsp;</span
></td><td id="7"><a href="#7">7</a></td></tr
><tr id="gr_svn14_8"

 onmouseover="gutterOver(8)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',8);">&nbsp;</span
></td><td id="8"><a href="#8">8</a></td></tr
><tr id="gr_svn14_9"

 onmouseover="gutterOver(9)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',9);">&nbsp;</span
></td><td id="9"><a href="#9">9</a></td></tr
><tr id="gr_svn14_10"

 onmouseover="gutterOver(10)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',10);">&nbsp;</span
></td><td id="10"><a href="#10">10</a></td></tr
><tr id="gr_svn14_11"

 onmouseover="gutterOver(11)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',11);">&nbsp;</span
></td><td id="11"><a href="#11">11</a></td></tr
><tr id="gr_svn14_12"

 onmouseover="gutterOver(12)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',12);">&nbsp;</span
></td><td id="12"><a href="#12">12</a></td></tr
><tr id="gr_svn14_13"

 onmouseover="gutterOver(13)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',13);">&nbsp;</span
></td><td id="13"><a href="#13">13</a></td></tr
><tr id="gr_svn14_14"

 onmouseover="gutterOver(14)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',14);">&nbsp;</span
></td><td id="14"><a href="#14">14</a></td></tr
><tr id="gr_svn14_15"

 onmouseover="gutterOver(15)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',15);">&nbsp;</span
></td><td id="15"><a href="#15">15</a></td></tr
><tr id="gr_svn14_16"

 onmouseover="gutterOver(16)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',16);">&nbsp;</span
></td><td id="16"><a href="#16">16</a></td></tr
><tr id="gr_svn14_17"

 onmouseover="gutterOver(17)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',17);">&nbsp;</span
></td><td id="17"><a href="#17">17</a></td></tr
><tr id="gr_svn14_18"

 onmouseover="gutterOver(18)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',18);">&nbsp;</span
></td><td id="18"><a href="#18">18</a></td></tr
><tr id="gr_svn14_19"

 onmouseover="gutterOver(19)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',19);">&nbsp;</span
></td><td id="19"><a href="#19">19</a></td></tr
><tr id="gr_svn14_20"

 onmouseover="gutterOver(20)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',20);">&nbsp;</span
></td><td id="20"><a href="#20">20</a></td></tr
><tr id="gr_svn14_21"

 onmouseover="gutterOver(21)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',21);">&nbsp;</span
></td><td id="21"><a href="#21">21</a></td></tr
><tr id="gr_svn14_22"

 onmouseover="gutterOver(22)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',22);">&nbsp;</span
></td><td id="22"><a href="#22">22</a></td></tr
><tr id="gr_svn14_23"

 onmouseover="gutterOver(23)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',23);">&nbsp;</span
></td><td id="23"><a href="#23">23</a></td></tr
><tr id="gr_svn14_24"

 onmouseover="gutterOver(24)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',24);">&nbsp;</span
></td><td id="24"><a href="#24">24</a></td></tr
><tr id="gr_svn14_25"

 onmouseover="gutterOver(25)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',25);">&nbsp;</span
></td><td id="25"><a href="#25">25</a></td></tr
><tr id="gr_svn14_26"

 onmouseover="gutterOver(26)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',26);">&nbsp;</span
></td><td id="26"><a href="#26">26</a></td></tr
><tr id="gr_svn14_27"

 onmouseover="gutterOver(27)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',27);">&nbsp;</span
></td><td id="27"><a href="#27">27</a></td></tr
><tr id="gr_svn14_28"

 onmouseover="gutterOver(28)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',28);">&nbsp;</span
></td><td id="28"><a href="#28">28</a></td></tr
><tr id="gr_svn14_29"

 onmouseover="gutterOver(29)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',29);">&nbsp;</span
></td><td id="29"><a href="#29">29</a></td></tr
><tr id="gr_svn14_30"

 onmouseover="gutterOver(30)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',30);">&nbsp;</span
></td><td id="30"><a href="#30">30</a></td></tr
><tr id="gr_svn14_31"

 onmouseover="gutterOver(31)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',31);">&nbsp;</span
></td><td id="31"><a href="#31">31</a></td></tr
><tr id="gr_svn14_32"

 onmouseover="gutterOver(32)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',32);">&nbsp;</span
></td><td id="32"><a href="#32">32</a></td></tr
><tr id="gr_svn14_33"

 onmouseover="gutterOver(33)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',33);">&nbsp;</span
></td><td id="33"><a href="#33">33</a></td></tr
><tr id="gr_svn14_34"

 onmouseover="gutterOver(34)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',34);">&nbsp;</span
></td><td id="34"><a href="#34">34</a></td></tr
><tr id="gr_svn14_35"

 onmouseover="gutterOver(35)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',35);">&nbsp;</span
></td><td id="35"><a href="#35">35</a></td></tr
><tr id="gr_svn14_36"

 onmouseover="gutterOver(36)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',36);">&nbsp;</span
></td><td id="36"><a href="#36">36</a></td></tr
><tr id="gr_svn14_37"

 onmouseover="gutterOver(37)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',37);">&nbsp;</span
></td><td id="37"><a href="#37">37</a></td></tr
><tr id="gr_svn14_38"

 onmouseover="gutterOver(38)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',38);">&nbsp;</span
></td><td id="38"><a href="#38">38</a></td></tr
><tr id="gr_svn14_39"

 onmouseover="gutterOver(39)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',39);">&nbsp;</span
></td><td id="39"><a href="#39">39</a></td></tr
><tr id="gr_svn14_40"

 onmouseover="gutterOver(40)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',40);">&nbsp;</span
></td><td id="40"><a href="#40">40</a></td></tr
><tr id="gr_svn14_41"

 onmouseover="gutterOver(41)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',41);">&nbsp;</span
></td><td id="41"><a href="#41">41</a></td></tr
><tr id="gr_svn14_42"

 onmouseover="gutterOver(42)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',42);">&nbsp;</span
></td><td id="42"><a href="#42">42</a></td></tr
><tr id="gr_svn14_43"

 onmouseover="gutterOver(43)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',43);">&nbsp;</span
></td><td id="43"><a href="#43">43</a></td></tr
><tr id="gr_svn14_44"

 onmouseover="gutterOver(44)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',44);">&nbsp;</span
></td><td id="44"><a href="#44">44</a></td></tr
><tr id="gr_svn14_45"

 onmouseover="gutterOver(45)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',45);">&nbsp;</span
></td><td id="45"><a href="#45">45</a></td></tr
><tr id="gr_svn14_46"

 onmouseover="gutterOver(46)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',46);">&nbsp;</span
></td><td id="46"><a href="#46">46</a></td></tr
><tr id="gr_svn14_47"

 onmouseover="gutterOver(47)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',47);">&nbsp;</span
></td><td id="47"><a href="#47">47</a></td></tr
><tr id="gr_svn14_48"

 onmouseover="gutterOver(48)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',48);">&nbsp;</span
></td><td id="48"><a href="#48">48</a></td></tr
><tr id="gr_svn14_49"

 onmouseover="gutterOver(49)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',49);">&nbsp;</span
></td><td id="49"><a href="#49">49</a></td></tr
><tr id="gr_svn14_50"

 onmouseover="gutterOver(50)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',50);">&nbsp;</span
></td><td id="50"><a href="#50">50</a></td></tr
><tr id="gr_svn14_51"

 onmouseover="gutterOver(51)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',51);">&nbsp;</span
></td><td id="51"><a href="#51">51</a></td></tr
><tr id="gr_svn14_52"

 onmouseover="gutterOver(52)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',52);">&nbsp;</span
></td><td id="52"><a href="#52">52</a></td></tr
><tr id="gr_svn14_53"

 onmouseover="gutterOver(53)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',53);">&nbsp;</span
></td><td id="53"><a href="#53">53</a></td></tr
><tr id="gr_svn14_54"

 onmouseover="gutterOver(54)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',54);">&nbsp;</span
></td><td id="54"><a href="#54">54</a></td></tr
><tr id="gr_svn14_55"

 onmouseover="gutterOver(55)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',55);">&nbsp;</span
></td><td id="55"><a href="#55">55</a></td></tr
><tr id="gr_svn14_56"

 onmouseover="gutterOver(56)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',56);">&nbsp;</span
></td><td id="56"><a href="#56">56</a></td></tr
><tr id="gr_svn14_57"

 onmouseover="gutterOver(57)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',57);">&nbsp;</span
></td><td id="57"><a href="#57">57</a></td></tr
><tr id="gr_svn14_58"

 onmouseover="gutterOver(58)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',58);">&nbsp;</span
></td><td id="58"><a href="#58">58</a></td></tr
><tr id="gr_svn14_59"

 onmouseover="gutterOver(59)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',59);">&nbsp;</span
></td><td id="59"><a href="#59">59</a></td></tr
><tr id="gr_svn14_60"

 onmouseover="gutterOver(60)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',60);">&nbsp;</span
></td><td id="60"><a href="#60">60</a></td></tr
><tr id="gr_svn14_61"

 onmouseover="gutterOver(61)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',61);">&nbsp;</span
></td><td id="61"><a href="#61">61</a></td></tr
><tr id="gr_svn14_62"

 onmouseover="gutterOver(62)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',62);">&nbsp;</span
></td><td id="62"><a href="#62">62</a></td></tr
><tr id="gr_svn14_63"

 onmouseover="gutterOver(63)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',63);">&nbsp;</span
></td><td id="63"><a href="#63">63</a></td></tr
><tr id="gr_svn14_64"

 onmouseover="gutterOver(64)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',64);">&nbsp;</span
></td><td id="64"><a href="#64">64</a></td></tr
><tr id="gr_svn14_65"

 onmouseover="gutterOver(65)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',65);">&nbsp;</span
></td><td id="65"><a href="#65">65</a></td></tr
><tr id="gr_svn14_66"

 onmouseover="gutterOver(66)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',66);">&nbsp;</span
></td><td id="66"><a href="#66">66</a></td></tr
><tr id="gr_svn14_67"

 onmouseover="gutterOver(67)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',67);">&nbsp;</span
></td><td id="67"><a href="#67">67</a></td></tr
><tr id="gr_svn14_68"

 onmouseover="gutterOver(68)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',68);">&nbsp;</span
></td><td id="68"><a href="#68">68</a></td></tr
><tr id="gr_svn14_69"

 onmouseover="gutterOver(69)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',69);">&nbsp;</span
></td><td id="69"><a href="#69">69</a></td></tr
><tr id="gr_svn14_70"

 onmouseover="gutterOver(70)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',70);">&nbsp;</span
></td><td id="70"><a href="#70">70</a></td></tr
><tr id="gr_svn14_71"

 onmouseover="gutterOver(71)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',71);">&nbsp;</span
></td><td id="71"><a href="#71">71</a></td></tr
><tr id="gr_svn14_72"

 onmouseover="gutterOver(72)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',72);">&nbsp;</span
></td><td id="72"><a href="#72">72</a></td></tr
><tr id="gr_svn14_73"

 onmouseover="gutterOver(73)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',73);">&nbsp;</span
></td><td id="73"><a href="#73">73</a></td></tr
><tr id="gr_svn14_74"

 onmouseover="gutterOver(74)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',74);">&nbsp;</span
></td><td id="74"><a href="#74">74</a></td></tr
><tr id="gr_svn14_75"

 onmouseover="gutterOver(75)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',75);">&nbsp;</span
></td><td id="75"><a href="#75">75</a></td></tr
><tr id="gr_svn14_76"

 onmouseover="gutterOver(76)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',76);">&nbsp;</span
></td><td id="76"><a href="#76">76</a></td></tr
><tr id="gr_svn14_77"

 onmouseover="gutterOver(77)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',77);">&nbsp;</span
></td><td id="77"><a href="#77">77</a></td></tr
><tr id="gr_svn14_78"

 onmouseover="gutterOver(78)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',78);">&nbsp;</span
></td><td id="78"><a href="#78">78</a></td></tr
><tr id="gr_svn14_79"

 onmouseover="gutterOver(79)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',79);">&nbsp;</span
></td><td id="79"><a href="#79">79</a></td></tr
><tr id="gr_svn14_80"

 onmouseover="gutterOver(80)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',80);">&nbsp;</span
></td><td id="80"><a href="#80">80</a></td></tr
><tr id="gr_svn14_81"

 onmouseover="gutterOver(81)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',81);">&nbsp;</span
></td><td id="81"><a href="#81">81</a></td></tr
><tr id="gr_svn14_82"

 onmouseover="gutterOver(82)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',82);">&nbsp;</span
></td><td id="82"><a href="#82">82</a></td></tr
><tr id="gr_svn14_83"

 onmouseover="gutterOver(83)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',83);">&nbsp;</span
></td><td id="83"><a href="#83">83</a></td></tr
><tr id="gr_svn14_84"

 onmouseover="gutterOver(84)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',84);">&nbsp;</span
></td><td id="84"><a href="#84">84</a></td></tr
><tr id="gr_svn14_85"

 onmouseover="gutterOver(85)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',85);">&nbsp;</span
></td><td id="85"><a href="#85">85</a></td></tr
><tr id="gr_svn14_86"

 onmouseover="gutterOver(86)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',86);">&nbsp;</span
></td><td id="86"><a href="#86">86</a></td></tr
><tr id="gr_svn14_87"

 onmouseover="gutterOver(87)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',87);">&nbsp;</span
></td><td id="87"><a href="#87">87</a></td></tr
><tr id="gr_svn14_88"

 onmouseover="gutterOver(88)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',88);">&nbsp;</span
></td><td id="88"><a href="#88">88</a></td></tr
><tr id="gr_svn14_89"

 onmouseover="gutterOver(89)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',89);">&nbsp;</span
></td><td id="89"><a href="#89">89</a></td></tr
><tr id="gr_svn14_90"

 onmouseover="gutterOver(90)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',90);">&nbsp;</span
></td><td id="90"><a href="#90">90</a></td></tr
><tr id="gr_svn14_91"

 onmouseover="gutterOver(91)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',91);">&nbsp;</span
></td><td id="91"><a href="#91">91</a></td></tr
><tr id="gr_svn14_92"

 onmouseover="gutterOver(92)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',92);">&nbsp;</span
></td><td id="92"><a href="#92">92</a></td></tr
><tr id="gr_svn14_93"

 onmouseover="gutterOver(93)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',93);">&nbsp;</span
></td><td id="93"><a href="#93">93</a></td></tr
><tr id="gr_svn14_94"

 onmouseover="gutterOver(94)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',94);">&nbsp;</span
></td><td id="94"><a href="#94">94</a></td></tr
><tr id="gr_svn14_95"

 onmouseover="gutterOver(95)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',95);">&nbsp;</span
></td><td id="95"><a href="#95">95</a></td></tr
><tr id="gr_svn14_96"

 onmouseover="gutterOver(96)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',96);">&nbsp;</span
></td><td id="96"><a href="#96">96</a></td></tr
><tr id="gr_svn14_97"

 onmouseover="gutterOver(97)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',97);">&nbsp;</span
></td><td id="97"><a href="#97">97</a></td></tr
><tr id="gr_svn14_98"

 onmouseover="gutterOver(98)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',98);">&nbsp;</span
></td><td id="98"><a href="#98">98</a></td></tr
><tr id="gr_svn14_99"

 onmouseover="gutterOver(99)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',99);">&nbsp;</span
></td><td id="99"><a href="#99">99</a></td></tr
><tr id="gr_svn14_100"

 onmouseover="gutterOver(100)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',100);">&nbsp;</span
></td><td id="100"><a href="#100">100</a></td></tr
><tr id="gr_svn14_101"

 onmouseover="gutterOver(101)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',101);">&nbsp;</span
></td><td id="101"><a href="#101">101</a></td></tr
><tr id="gr_svn14_102"

 onmouseover="gutterOver(102)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',102);">&nbsp;</span
></td><td id="102"><a href="#102">102</a></td></tr
><tr id="gr_svn14_103"

 onmouseover="gutterOver(103)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',103);">&nbsp;</span
></td><td id="103"><a href="#103">103</a></td></tr
><tr id="gr_svn14_104"

 onmouseover="gutterOver(104)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',104);">&nbsp;</span
></td><td id="104"><a href="#104">104</a></td></tr
><tr id="gr_svn14_105"

 onmouseover="gutterOver(105)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',105);">&nbsp;</span
></td><td id="105"><a href="#105">105</a></td></tr
><tr id="gr_svn14_106"

 onmouseover="gutterOver(106)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',106);">&nbsp;</span
></td><td id="106"><a href="#106">106</a></td></tr
><tr id="gr_svn14_107"

 onmouseover="gutterOver(107)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',107);">&nbsp;</span
></td><td id="107"><a href="#107">107</a></td></tr
><tr id="gr_svn14_108"

 onmouseover="gutterOver(108)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',108);">&nbsp;</span
></td><td id="108"><a href="#108">108</a></td></tr
><tr id="gr_svn14_109"

 onmouseover="gutterOver(109)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',109);">&nbsp;</span
></td><td id="109"><a href="#109">109</a></td></tr
><tr id="gr_svn14_110"

 onmouseover="gutterOver(110)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',110);">&nbsp;</span
></td><td id="110"><a href="#110">110</a></td></tr
><tr id="gr_svn14_111"

 onmouseover="gutterOver(111)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',111);">&nbsp;</span
></td><td id="111"><a href="#111">111</a></td></tr
><tr id="gr_svn14_112"

 onmouseover="gutterOver(112)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',112);">&nbsp;</span
></td><td id="112"><a href="#112">112</a></td></tr
><tr id="gr_svn14_113"

 onmouseover="gutterOver(113)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',113);">&nbsp;</span
></td><td id="113"><a href="#113">113</a></td></tr
><tr id="gr_svn14_114"

 onmouseover="gutterOver(114)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',114);">&nbsp;</span
></td><td id="114"><a href="#114">114</a></td></tr
><tr id="gr_svn14_115"

 onmouseover="gutterOver(115)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',115);">&nbsp;</span
></td><td id="115"><a href="#115">115</a></td></tr
><tr id="gr_svn14_116"

 onmouseover="gutterOver(116)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',116);">&nbsp;</span
></td><td id="116"><a href="#116">116</a></td></tr
><tr id="gr_svn14_117"

 onmouseover="gutterOver(117)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',117);">&nbsp;</span
></td><td id="117"><a href="#117">117</a></td></tr
><tr id="gr_svn14_118"

 onmouseover="gutterOver(118)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',118);">&nbsp;</span
></td><td id="118"><a href="#118">118</a></td></tr
><tr id="gr_svn14_119"

 onmouseover="gutterOver(119)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',119);">&nbsp;</span
></td><td id="119"><a href="#119">119</a></td></tr
><tr id="gr_svn14_120"

 onmouseover="gutterOver(120)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',120);">&nbsp;</span
></td><td id="120"><a href="#120">120</a></td></tr
><tr id="gr_svn14_121"

 onmouseover="gutterOver(121)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',121);">&nbsp;</span
></td><td id="121"><a href="#121">121</a></td></tr
><tr id="gr_svn14_122"

 onmouseover="gutterOver(122)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',122);">&nbsp;</span
></td><td id="122"><a href="#122">122</a></td></tr
><tr id="gr_svn14_123"

 onmouseover="gutterOver(123)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',123);">&nbsp;</span
></td><td id="123"><a href="#123">123</a></td></tr
><tr id="gr_svn14_124"

 onmouseover="gutterOver(124)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',124);">&nbsp;</span
></td><td id="124"><a href="#124">124</a></td></tr
><tr id="gr_svn14_125"

 onmouseover="gutterOver(125)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',125);">&nbsp;</span
></td><td id="125"><a href="#125">125</a></td></tr
><tr id="gr_svn14_126"

 onmouseover="gutterOver(126)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',126);">&nbsp;</span
></td><td id="126"><a href="#126">126</a></td></tr
><tr id="gr_svn14_127"

 onmouseover="gutterOver(127)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',127);">&nbsp;</span
></td><td id="127"><a href="#127">127</a></td></tr
><tr id="gr_svn14_128"

 onmouseover="gutterOver(128)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',128);">&nbsp;</span
></td><td id="128"><a href="#128">128</a></td></tr
><tr id="gr_svn14_129"

 onmouseover="gutterOver(129)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',129);">&nbsp;</span
></td><td id="129"><a href="#129">129</a></td></tr
><tr id="gr_svn14_130"

 onmouseover="gutterOver(130)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',130);">&nbsp;</span
></td><td id="130"><a href="#130">130</a></td></tr
><tr id="gr_svn14_131"

 onmouseover="gutterOver(131)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',131);">&nbsp;</span
></td><td id="131"><a href="#131">131</a></td></tr
><tr id="gr_svn14_132"

 onmouseover="gutterOver(132)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',132);">&nbsp;</span
></td><td id="132"><a href="#132">132</a></td></tr
><tr id="gr_svn14_133"

 onmouseover="gutterOver(133)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',133);">&nbsp;</span
></td><td id="133"><a href="#133">133</a></td></tr
><tr id="gr_svn14_134"

 onmouseover="gutterOver(134)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',134);">&nbsp;</span
></td><td id="134"><a href="#134">134</a></td></tr
><tr id="gr_svn14_135"

 onmouseover="gutterOver(135)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',135);">&nbsp;</span
></td><td id="135"><a href="#135">135</a></td></tr
><tr id="gr_svn14_136"

 onmouseover="gutterOver(136)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',136);">&nbsp;</span
></td><td id="136"><a href="#136">136</a></td></tr
><tr id="gr_svn14_137"

 onmouseover="gutterOver(137)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',137);">&nbsp;</span
></td><td id="137"><a href="#137">137</a></td></tr
><tr id="gr_svn14_138"

 onmouseover="gutterOver(138)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',138);">&nbsp;</span
></td><td id="138"><a href="#138">138</a></td></tr
><tr id="gr_svn14_139"

 onmouseover="gutterOver(139)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',139);">&nbsp;</span
></td><td id="139"><a href="#139">139</a></td></tr
><tr id="gr_svn14_140"

 onmouseover="gutterOver(140)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',140);">&nbsp;</span
></td><td id="140"><a href="#140">140</a></td></tr
><tr id="gr_svn14_141"

 onmouseover="gutterOver(141)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',141);">&nbsp;</span
></td><td id="141"><a href="#141">141</a></td></tr
><tr id="gr_svn14_142"

 onmouseover="gutterOver(142)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',142);">&nbsp;</span
></td><td id="142"><a href="#142">142</a></td></tr
><tr id="gr_svn14_143"

 onmouseover="gutterOver(143)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',143);">&nbsp;</span
></td><td id="143"><a href="#143">143</a></td></tr
><tr id="gr_svn14_144"

 onmouseover="gutterOver(144)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',144);">&nbsp;</span
></td><td id="144"><a href="#144">144</a></td></tr
><tr id="gr_svn14_145"

 onmouseover="gutterOver(145)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',145);">&nbsp;</span
></td><td id="145"><a href="#145">145</a></td></tr
><tr id="gr_svn14_146"

 onmouseover="gutterOver(146)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',146);">&nbsp;</span
></td><td id="146"><a href="#146">146</a></td></tr
><tr id="gr_svn14_147"

 onmouseover="gutterOver(147)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',147);">&nbsp;</span
></td><td id="147"><a href="#147">147</a></td></tr
><tr id="gr_svn14_148"

 onmouseover="gutterOver(148)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',148);">&nbsp;</span
></td><td id="148"><a href="#148">148</a></td></tr
><tr id="gr_svn14_149"

 onmouseover="gutterOver(149)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',149);">&nbsp;</span
></td><td id="149"><a href="#149">149</a></td></tr
><tr id="gr_svn14_150"

 onmouseover="gutterOver(150)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',150);">&nbsp;</span
></td><td id="150"><a href="#150">150</a></td></tr
><tr id="gr_svn14_151"

 onmouseover="gutterOver(151)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',151);">&nbsp;</span
></td><td id="151"><a href="#151">151</a></td></tr
><tr id="gr_svn14_152"

 onmouseover="gutterOver(152)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',152);">&nbsp;</span
></td><td id="152"><a href="#152">152</a></td></tr
><tr id="gr_svn14_153"

 onmouseover="gutterOver(153)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',153);">&nbsp;</span
></td><td id="153"><a href="#153">153</a></td></tr
><tr id="gr_svn14_154"

 onmouseover="gutterOver(154)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',154);">&nbsp;</span
></td><td id="154"><a href="#154">154</a></td></tr
><tr id="gr_svn14_155"

 onmouseover="gutterOver(155)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',155);">&nbsp;</span
></td><td id="155"><a href="#155">155</a></td></tr
><tr id="gr_svn14_156"

 onmouseover="gutterOver(156)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',156);">&nbsp;</span
></td><td id="156"><a href="#156">156</a></td></tr
><tr id="gr_svn14_157"

 onmouseover="gutterOver(157)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',157);">&nbsp;</span
></td><td id="157"><a href="#157">157</a></td></tr
><tr id="gr_svn14_158"

 onmouseover="gutterOver(158)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',158);">&nbsp;</span
></td><td id="158"><a href="#158">158</a></td></tr
><tr id="gr_svn14_159"

 onmouseover="gutterOver(159)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',159);">&nbsp;</span
></td><td id="159"><a href="#159">159</a></td></tr
><tr id="gr_svn14_160"

 onmouseover="gutterOver(160)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',160);">&nbsp;</span
></td><td id="160"><a href="#160">160</a></td></tr
><tr id="gr_svn14_161"

 onmouseover="gutterOver(161)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',161);">&nbsp;</span
></td><td id="161"><a href="#161">161</a></td></tr
><tr id="gr_svn14_162"

 onmouseover="gutterOver(162)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',162);">&nbsp;</span
></td><td id="162"><a href="#162">162</a></td></tr
><tr id="gr_svn14_163"

 onmouseover="gutterOver(163)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',163);">&nbsp;</span
></td><td id="163"><a href="#163">163</a></td></tr
><tr id="gr_svn14_164"

 onmouseover="gutterOver(164)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',164);">&nbsp;</span
></td><td id="164"><a href="#164">164</a></td></tr
><tr id="gr_svn14_165"

 onmouseover="gutterOver(165)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',165);">&nbsp;</span
></td><td id="165"><a href="#165">165</a></td></tr
><tr id="gr_svn14_166"

 onmouseover="gutterOver(166)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',166);">&nbsp;</span
></td><td id="166"><a href="#166">166</a></td></tr
><tr id="gr_svn14_167"

 onmouseover="gutterOver(167)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',167);">&nbsp;</span
></td><td id="167"><a href="#167">167</a></td></tr
><tr id="gr_svn14_168"

 onmouseover="gutterOver(168)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',168);">&nbsp;</span
></td><td id="168"><a href="#168">168</a></td></tr
><tr id="gr_svn14_169"

 onmouseover="gutterOver(169)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',169);">&nbsp;</span
></td><td id="169"><a href="#169">169</a></td></tr
><tr id="gr_svn14_170"

 onmouseover="gutterOver(170)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',170);">&nbsp;</span
></td><td id="170"><a href="#170">170</a></td></tr
><tr id="gr_svn14_171"

 onmouseover="gutterOver(171)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',171);">&nbsp;</span
></td><td id="171"><a href="#171">171</a></td></tr
><tr id="gr_svn14_172"

 onmouseover="gutterOver(172)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',172);">&nbsp;</span
></td><td id="172"><a href="#172">172</a></td></tr
><tr id="gr_svn14_173"

 onmouseover="gutterOver(173)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',173);">&nbsp;</span
></td><td id="173"><a href="#173">173</a></td></tr
><tr id="gr_svn14_174"

 onmouseover="gutterOver(174)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',174);">&nbsp;</span
></td><td id="174"><a href="#174">174</a></td></tr
><tr id="gr_svn14_175"

 onmouseover="gutterOver(175)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',175);">&nbsp;</span
></td><td id="175"><a href="#175">175</a></td></tr
><tr id="gr_svn14_176"

 onmouseover="gutterOver(176)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',176);">&nbsp;</span
></td><td id="176"><a href="#176">176</a></td></tr
><tr id="gr_svn14_177"

 onmouseover="gutterOver(177)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',177);">&nbsp;</span
></td><td id="177"><a href="#177">177</a></td></tr
><tr id="gr_svn14_178"

 onmouseover="gutterOver(178)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',178);">&nbsp;</span
></td><td id="178"><a href="#178">178</a></td></tr
><tr id="gr_svn14_179"

 onmouseover="gutterOver(179)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',179);">&nbsp;</span
></td><td id="179"><a href="#179">179</a></td></tr
><tr id="gr_svn14_180"

 onmouseover="gutterOver(180)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',180);">&nbsp;</span
></td><td id="180"><a href="#180">180</a></td></tr
><tr id="gr_svn14_181"

 onmouseover="gutterOver(181)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',181);">&nbsp;</span
></td><td id="181"><a href="#181">181</a></td></tr
><tr id="gr_svn14_182"

 onmouseover="gutterOver(182)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',182);">&nbsp;</span
></td><td id="182"><a href="#182">182</a></td></tr
><tr id="gr_svn14_183"

 onmouseover="gutterOver(183)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',183);">&nbsp;</span
></td><td id="183"><a href="#183">183</a></td></tr
><tr id="gr_svn14_184"

 onmouseover="gutterOver(184)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',184);">&nbsp;</span
></td><td id="184"><a href="#184">184</a></td></tr
><tr id="gr_svn14_185"

 onmouseover="gutterOver(185)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',185);">&nbsp;</span
></td><td id="185"><a href="#185">185</a></td></tr
><tr id="gr_svn14_186"

 onmouseover="gutterOver(186)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',186);">&nbsp;</span
></td><td id="186"><a href="#186">186</a></td></tr
><tr id="gr_svn14_187"

 onmouseover="gutterOver(187)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',187);">&nbsp;</span
></td><td id="187"><a href="#187">187</a></td></tr
><tr id="gr_svn14_188"

 onmouseover="gutterOver(188)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',188);">&nbsp;</span
></td><td id="188"><a href="#188">188</a></td></tr
><tr id="gr_svn14_189"

 onmouseover="gutterOver(189)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',189);">&nbsp;</span
></td><td id="189"><a href="#189">189</a></td></tr
><tr id="gr_svn14_190"

 onmouseover="gutterOver(190)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',190);">&nbsp;</span
></td><td id="190"><a href="#190">190</a></td></tr
><tr id="gr_svn14_191"

 onmouseover="gutterOver(191)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',191);">&nbsp;</span
></td><td id="191"><a href="#191">191</a></td></tr
><tr id="gr_svn14_192"

 onmouseover="gutterOver(192)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',192);">&nbsp;</span
></td><td id="192"><a href="#192">192</a></td></tr
><tr id="gr_svn14_193"

 onmouseover="gutterOver(193)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',193);">&nbsp;</span
></td><td id="193"><a href="#193">193</a></td></tr
><tr id="gr_svn14_194"

 onmouseover="gutterOver(194)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',194);">&nbsp;</span
></td><td id="194"><a href="#194">194</a></td></tr
><tr id="gr_svn14_195"

 onmouseover="gutterOver(195)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',195);">&nbsp;</span
></td><td id="195"><a href="#195">195</a></td></tr
><tr id="gr_svn14_196"

 onmouseover="gutterOver(196)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',196);">&nbsp;</span
></td><td id="196"><a href="#196">196</a></td></tr
><tr id="gr_svn14_197"

 onmouseover="gutterOver(197)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',197);">&nbsp;</span
></td><td id="197"><a href="#197">197</a></td></tr
><tr id="gr_svn14_198"

 onmouseover="gutterOver(198)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',198);">&nbsp;</span
></td><td id="198"><a href="#198">198</a></td></tr
><tr id="gr_svn14_199"

 onmouseover="gutterOver(199)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',199);">&nbsp;</span
></td><td id="199"><a href="#199">199</a></td></tr
><tr id="gr_svn14_200"

 onmouseover="gutterOver(200)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',200);">&nbsp;</span
></td><td id="200"><a href="#200">200</a></td></tr
><tr id="gr_svn14_201"

 onmouseover="gutterOver(201)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',201);">&nbsp;</span
></td><td id="201"><a href="#201">201</a></td></tr
><tr id="gr_svn14_202"

 onmouseover="gutterOver(202)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',202);">&nbsp;</span
></td><td id="202"><a href="#202">202</a></td></tr
><tr id="gr_svn14_203"

 onmouseover="gutterOver(203)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',203);">&nbsp;</span
></td><td id="203"><a href="#203">203</a></td></tr
><tr id="gr_svn14_204"

 onmouseover="gutterOver(204)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',204);">&nbsp;</span
></td><td id="204"><a href="#204">204</a></td></tr
><tr id="gr_svn14_205"

 onmouseover="gutterOver(205)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',205);">&nbsp;</span
></td><td id="205"><a href="#205">205</a></td></tr
><tr id="gr_svn14_206"

 onmouseover="gutterOver(206)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',206);">&nbsp;</span
></td><td id="206"><a href="#206">206</a></td></tr
><tr id="gr_svn14_207"

 onmouseover="gutterOver(207)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',207);">&nbsp;</span
></td><td id="207"><a href="#207">207</a></td></tr
><tr id="gr_svn14_208"

 onmouseover="gutterOver(208)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',208);">&nbsp;</span
></td><td id="208"><a href="#208">208</a></td></tr
><tr id="gr_svn14_209"

 onmouseover="gutterOver(209)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',209);">&nbsp;</span
></td><td id="209"><a href="#209">209</a></td></tr
><tr id="gr_svn14_210"

 onmouseover="gutterOver(210)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',210);">&nbsp;</span
></td><td id="210"><a href="#210">210</a></td></tr
><tr id="gr_svn14_211"

 onmouseover="gutterOver(211)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',211);">&nbsp;</span
></td><td id="211"><a href="#211">211</a></td></tr
><tr id="gr_svn14_212"

 onmouseover="gutterOver(212)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',212);">&nbsp;</span
></td><td id="212"><a href="#212">212</a></td></tr
><tr id="gr_svn14_213"

 onmouseover="gutterOver(213)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',213);">&nbsp;</span
></td><td id="213"><a href="#213">213</a></td></tr
><tr id="gr_svn14_214"

 onmouseover="gutterOver(214)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',214);">&nbsp;</span
></td><td id="214"><a href="#214">214</a></td></tr
><tr id="gr_svn14_215"

 onmouseover="gutterOver(215)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',215);">&nbsp;</span
></td><td id="215"><a href="#215">215</a></td></tr
><tr id="gr_svn14_216"

 onmouseover="gutterOver(216)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',216);">&nbsp;</span
></td><td id="216"><a href="#216">216</a></td></tr
><tr id="gr_svn14_217"

 onmouseover="gutterOver(217)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',217);">&nbsp;</span
></td><td id="217"><a href="#217">217</a></td></tr
><tr id="gr_svn14_218"

 onmouseover="gutterOver(218)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',218);">&nbsp;</span
></td><td id="218"><a href="#218">218</a></td></tr
><tr id="gr_svn14_219"

 onmouseover="gutterOver(219)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',219);">&nbsp;</span
></td><td id="219"><a href="#219">219</a></td></tr
><tr id="gr_svn14_220"

 onmouseover="gutterOver(220)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',220);">&nbsp;</span
></td><td id="220"><a href="#220">220</a></td></tr
><tr id="gr_svn14_221"

 onmouseover="gutterOver(221)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',221);">&nbsp;</span
></td><td id="221"><a href="#221">221</a></td></tr
><tr id="gr_svn14_222"

 onmouseover="gutterOver(222)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',222);">&nbsp;</span
></td><td id="222"><a href="#222">222</a></td></tr
><tr id="gr_svn14_223"

 onmouseover="gutterOver(223)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',223);">&nbsp;</span
></td><td id="223"><a href="#223">223</a></td></tr
><tr id="gr_svn14_224"

 onmouseover="gutterOver(224)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',224);">&nbsp;</span
></td><td id="224"><a href="#224">224</a></td></tr
><tr id="gr_svn14_225"

 onmouseover="gutterOver(225)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',225);">&nbsp;</span
></td><td id="225"><a href="#225">225</a></td></tr
><tr id="gr_svn14_226"

 onmouseover="gutterOver(226)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',226);">&nbsp;</span
></td><td id="226"><a href="#226">226</a></td></tr
><tr id="gr_svn14_227"

 onmouseover="gutterOver(227)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',227);">&nbsp;</span
></td><td id="227"><a href="#227">227</a></td></tr
><tr id="gr_svn14_228"

 onmouseover="gutterOver(228)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',228);">&nbsp;</span
></td><td id="228"><a href="#228">228</a></td></tr
><tr id="gr_svn14_229"

 onmouseover="gutterOver(229)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',229);">&nbsp;</span
></td><td id="229"><a href="#229">229</a></td></tr
><tr id="gr_svn14_230"

 onmouseover="gutterOver(230)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',230);">&nbsp;</span
></td><td id="230"><a href="#230">230</a></td></tr
><tr id="gr_svn14_231"

 onmouseover="gutterOver(231)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',231);">&nbsp;</span
></td><td id="231"><a href="#231">231</a></td></tr
><tr id="gr_svn14_232"

 onmouseover="gutterOver(232)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',232);">&nbsp;</span
></td><td id="232"><a href="#232">232</a></td></tr
><tr id="gr_svn14_233"

 onmouseover="gutterOver(233)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',233);">&nbsp;</span
></td><td id="233"><a href="#233">233</a></td></tr
><tr id="gr_svn14_234"

 onmouseover="gutterOver(234)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',234);">&nbsp;</span
></td><td id="234"><a href="#234">234</a></td></tr
><tr id="gr_svn14_235"

 onmouseover="gutterOver(235)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',235);">&nbsp;</span
></td><td id="235"><a href="#235">235</a></td></tr
><tr id="gr_svn14_236"

 onmouseover="gutterOver(236)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',236);">&nbsp;</span
></td><td id="236"><a href="#236">236</a></td></tr
><tr id="gr_svn14_237"

 onmouseover="gutterOver(237)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',237);">&nbsp;</span
></td><td id="237"><a href="#237">237</a></td></tr
><tr id="gr_svn14_238"

 onmouseover="gutterOver(238)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',238);">&nbsp;</span
></td><td id="238"><a href="#238">238</a></td></tr
><tr id="gr_svn14_239"

 onmouseover="gutterOver(239)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',239);">&nbsp;</span
></td><td id="239"><a href="#239">239</a></td></tr
><tr id="gr_svn14_240"

 onmouseover="gutterOver(240)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',240);">&nbsp;</span
></td><td id="240"><a href="#240">240</a></td></tr
><tr id="gr_svn14_241"

 onmouseover="gutterOver(241)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',241);">&nbsp;</span
></td><td id="241"><a href="#241">241</a></td></tr
><tr id="gr_svn14_242"

 onmouseover="gutterOver(242)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',242);">&nbsp;</span
></td><td id="242"><a href="#242">242</a></td></tr
><tr id="gr_svn14_243"

 onmouseover="gutterOver(243)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',243);">&nbsp;</span
></td><td id="243"><a href="#243">243</a></td></tr
><tr id="gr_svn14_244"

 onmouseover="gutterOver(244)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',244);">&nbsp;</span
></td><td id="244"><a href="#244">244</a></td></tr
><tr id="gr_svn14_245"

 onmouseover="gutterOver(245)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',245);">&nbsp;</span
></td><td id="245"><a href="#245">245</a></td></tr
><tr id="gr_svn14_246"

 onmouseover="gutterOver(246)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',246);">&nbsp;</span
></td><td id="246"><a href="#246">246</a></td></tr
><tr id="gr_svn14_247"

 onmouseover="gutterOver(247)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',247);">&nbsp;</span
></td><td id="247"><a href="#247">247</a></td></tr
><tr id="gr_svn14_248"

 onmouseover="gutterOver(248)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',248);">&nbsp;</span
></td><td id="248"><a href="#248">248</a></td></tr
><tr id="gr_svn14_249"

 onmouseover="gutterOver(249)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',249);">&nbsp;</span
></td><td id="249"><a href="#249">249</a></td></tr
><tr id="gr_svn14_250"

 onmouseover="gutterOver(250)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',250);">&nbsp;</span
></td><td id="250"><a href="#250">250</a></td></tr
><tr id="gr_svn14_251"

 onmouseover="gutterOver(251)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',251);">&nbsp;</span
></td><td id="251"><a href="#251">251</a></td></tr
><tr id="gr_svn14_252"

 onmouseover="gutterOver(252)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',252);">&nbsp;</span
></td><td id="252"><a href="#252">252</a></td></tr
><tr id="gr_svn14_253"

 onmouseover="gutterOver(253)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',253);">&nbsp;</span
></td><td id="253"><a href="#253">253</a></td></tr
><tr id="gr_svn14_254"

 onmouseover="gutterOver(254)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',254);">&nbsp;</span
></td><td id="254"><a href="#254">254</a></td></tr
><tr id="gr_svn14_255"

 onmouseover="gutterOver(255)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',255);">&nbsp;</span
></td><td id="255"><a href="#255">255</a></td></tr
><tr id="gr_svn14_256"

 onmouseover="gutterOver(256)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',256);">&nbsp;</span
></td><td id="256"><a href="#256">256</a></td></tr
><tr id="gr_svn14_257"

 onmouseover="gutterOver(257)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',257);">&nbsp;</span
></td><td id="257"><a href="#257">257</a></td></tr
><tr id="gr_svn14_258"

 onmouseover="gutterOver(258)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',258);">&nbsp;</span
></td><td id="258"><a href="#258">258</a></td></tr
><tr id="gr_svn14_259"

 onmouseover="gutterOver(259)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',259);">&nbsp;</span
></td><td id="259"><a href="#259">259</a></td></tr
><tr id="gr_svn14_260"

 onmouseover="gutterOver(260)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',260);">&nbsp;</span
></td><td id="260"><a href="#260">260</a></td></tr
><tr id="gr_svn14_261"

 onmouseover="gutterOver(261)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',261);">&nbsp;</span
></td><td id="261"><a href="#261">261</a></td></tr
><tr id="gr_svn14_262"

 onmouseover="gutterOver(262)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',262);">&nbsp;</span
></td><td id="262"><a href="#262">262</a></td></tr
><tr id="gr_svn14_263"

 onmouseover="gutterOver(263)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',263);">&nbsp;</span
></td><td id="263"><a href="#263">263</a></td></tr
><tr id="gr_svn14_264"

 onmouseover="gutterOver(264)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',264);">&nbsp;</span
></td><td id="264"><a href="#264">264</a></td></tr
><tr id="gr_svn14_265"

 onmouseover="gutterOver(265)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',265);">&nbsp;</span
></td><td id="265"><a href="#265">265</a></td></tr
><tr id="gr_svn14_266"

 onmouseover="gutterOver(266)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',266);">&nbsp;</span
></td><td id="266"><a href="#266">266</a></td></tr
><tr id="gr_svn14_267"

 onmouseover="gutterOver(267)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',267);">&nbsp;</span
></td><td id="267"><a href="#267">267</a></td></tr
><tr id="gr_svn14_268"

 onmouseover="gutterOver(268)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',268);">&nbsp;</span
></td><td id="268"><a href="#268">268</a></td></tr
><tr id="gr_svn14_269"

 onmouseover="gutterOver(269)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',269);">&nbsp;</span
></td><td id="269"><a href="#269">269</a></td></tr
><tr id="gr_svn14_270"

 onmouseover="gutterOver(270)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',270);">&nbsp;</span
></td><td id="270"><a href="#270">270</a></td></tr
><tr id="gr_svn14_271"

 onmouseover="gutterOver(271)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',271);">&nbsp;</span
></td><td id="271"><a href="#271">271</a></td></tr
><tr id="gr_svn14_272"

 onmouseover="gutterOver(272)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',272);">&nbsp;</span
></td><td id="272"><a href="#272">272</a></td></tr
><tr id="gr_svn14_273"

 onmouseover="gutterOver(273)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',273);">&nbsp;</span
></td><td id="273"><a href="#273">273</a></td></tr
><tr id="gr_svn14_274"

 onmouseover="gutterOver(274)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',274);">&nbsp;</span
></td><td id="274"><a href="#274">274</a></td></tr
><tr id="gr_svn14_275"

 onmouseover="gutterOver(275)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',275);">&nbsp;</span
></td><td id="275"><a href="#275">275</a></td></tr
><tr id="gr_svn14_276"

 onmouseover="gutterOver(276)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',276);">&nbsp;</span
></td><td id="276"><a href="#276">276</a></td></tr
><tr id="gr_svn14_277"

 onmouseover="gutterOver(277)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',277);">&nbsp;</span
></td><td id="277"><a href="#277">277</a></td></tr
><tr id="gr_svn14_278"

 onmouseover="gutterOver(278)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',278);">&nbsp;</span
></td><td id="278"><a href="#278">278</a></td></tr
><tr id="gr_svn14_279"

 onmouseover="gutterOver(279)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',279);">&nbsp;</span
></td><td id="279"><a href="#279">279</a></td></tr
><tr id="gr_svn14_280"

 onmouseover="gutterOver(280)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',280);">&nbsp;</span
></td><td id="280"><a href="#280">280</a></td></tr
><tr id="gr_svn14_281"

 onmouseover="gutterOver(281)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',281);">&nbsp;</span
></td><td id="281"><a href="#281">281</a></td></tr
><tr id="gr_svn14_282"

 onmouseover="gutterOver(282)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',282);">&nbsp;</span
></td><td id="282"><a href="#282">282</a></td></tr
><tr id="gr_svn14_283"

 onmouseover="gutterOver(283)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',283);">&nbsp;</span
></td><td id="283"><a href="#283">283</a></td></tr
><tr id="gr_svn14_284"

 onmouseover="gutterOver(284)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',284);">&nbsp;</span
></td><td id="284"><a href="#284">284</a></td></tr
><tr id="gr_svn14_285"

 onmouseover="gutterOver(285)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',285);">&nbsp;</span
></td><td id="285"><a href="#285">285</a></td></tr
><tr id="gr_svn14_286"

 onmouseover="gutterOver(286)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',286);">&nbsp;</span
></td><td id="286"><a href="#286">286</a></td></tr
><tr id="gr_svn14_287"

 onmouseover="gutterOver(287)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',287);">&nbsp;</span
></td><td id="287"><a href="#287">287</a></td></tr
><tr id="gr_svn14_288"

 onmouseover="gutterOver(288)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',288);">&nbsp;</span
></td><td id="288"><a href="#288">288</a></td></tr
><tr id="gr_svn14_289"

 onmouseover="gutterOver(289)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',289);">&nbsp;</span
></td><td id="289"><a href="#289">289</a></td></tr
><tr id="gr_svn14_290"

 onmouseover="gutterOver(290)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',290);">&nbsp;</span
></td><td id="290"><a href="#290">290</a></td></tr
><tr id="gr_svn14_291"

 onmouseover="gutterOver(291)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',291);">&nbsp;</span
></td><td id="291"><a href="#291">291</a></td></tr
><tr id="gr_svn14_292"

 onmouseover="gutterOver(292)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',292);">&nbsp;</span
></td><td id="292"><a href="#292">292</a></td></tr
><tr id="gr_svn14_293"

 onmouseover="gutterOver(293)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',293);">&nbsp;</span
></td><td id="293"><a href="#293">293</a></td></tr
><tr id="gr_svn14_294"

 onmouseover="gutterOver(294)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',294);">&nbsp;</span
></td><td id="294"><a href="#294">294</a></td></tr
><tr id="gr_svn14_295"

 onmouseover="gutterOver(295)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',295);">&nbsp;</span
></td><td id="295"><a href="#295">295</a></td></tr
><tr id="gr_svn14_296"

 onmouseover="gutterOver(296)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',296);">&nbsp;</span
></td><td id="296"><a href="#296">296</a></td></tr
><tr id="gr_svn14_297"

 onmouseover="gutterOver(297)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',297);">&nbsp;</span
></td><td id="297"><a href="#297">297</a></td></tr
><tr id="gr_svn14_298"

 onmouseover="gutterOver(298)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',298);">&nbsp;</span
></td><td id="298"><a href="#298">298</a></td></tr
><tr id="gr_svn14_299"

 onmouseover="gutterOver(299)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',299);">&nbsp;</span
></td><td id="299"><a href="#299">299</a></td></tr
><tr id="gr_svn14_300"

 onmouseover="gutterOver(300)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',300);">&nbsp;</span
></td><td id="300"><a href="#300">300</a></td></tr
><tr id="gr_svn14_301"

 onmouseover="gutterOver(301)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',301);">&nbsp;</span
></td><td id="301"><a href="#301">301</a></td></tr
><tr id="gr_svn14_302"

 onmouseover="gutterOver(302)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',302);">&nbsp;</span
></td><td id="302"><a href="#302">302</a></td></tr
><tr id="gr_svn14_303"

 onmouseover="gutterOver(303)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',303);">&nbsp;</span
></td><td id="303"><a href="#303">303</a></td></tr
><tr id="gr_svn14_304"

 onmouseover="gutterOver(304)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',304);">&nbsp;</span
></td><td id="304"><a href="#304">304</a></td></tr
><tr id="gr_svn14_305"

 onmouseover="gutterOver(305)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',305);">&nbsp;</span
></td><td id="305"><a href="#305">305</a></td></tr
><tr id="gr_svn14_306"

 onmouseover="gutterOver(306)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',306);">&nbsp;</span
></td><td id="306"><a href="#306">306</a></td></tr
><tr id="gr_svn14_307"

 onmouseover="gutterOver(307)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',307);">&nbsp;</span
></td><td id="307"><a href="#307">307</a></td></tr
><tr id="gr_svn14_308"

 onmouseover="gutterOver(308)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',308);">&nbsp;</span
></td><td id="308"><a href="#308">308</a></td></tr
><tr id="gr_svn14_309"

 onmouseover="gutterOver(309)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',309);">&nbsp;</span
></td><td id="309"><a href="#309">309</a></td></tr
><tr id="gr_svn14_310"

 onmouseover="gutterOver(310)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',310);">&nbsp;</span
></td><td id="310"><a href="#310">310</a></td></tr
><tr id="gr_svn14_311"

 onmouseover="gutterOver(311)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',311);">&nbsp;</span
></td><td id="311"><a href="#311">311</a></td></tr
><tr id="gr_svn14_312"

 onmouseover="gutterOver(312)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',312);">&nbsp;</span
></td><td id="312"><a href="#312">312</a></td></tr
><tr id="gr_svn14_313"

 onmouseover="gutterOver(313)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',313);">&nbsp;</span
></td><td id="313"><a href="#313">313</a></td></tr
><tr id="gr_svn14_314"

 onmouseover="gutterOver(314)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',314);">&nbsp;</span
></td><td id="314"><a href="#314">314</a></td></tr
><tr id="gr_svn14_315"

 onmouseover="gutterOver(315)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',315);">&nbsp;</span
></td><td id="315"><a href="#315">315</a></td></tr
><tr id="gr_svn14_316"

 onmouseover="gutterOver(316)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',316);">&nbsp;</span
></td><td id="316"><a href="#316">316</a></td></tr
><tr id="gr_svn14_317"

 onmouseover="gutterOver(317)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',317);">&nbsp;</span
></td><td id="317"><a href="#317">317</a></td></tr
><tr id="gr_svn14_318"

 onmouseover="gutterOver(318)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',318);">&nbsp;</span
></td><td id="318"><a href="#318">318</a></td></tr
><tr id="gr_svn14_319"

 onmouseover="gutterOver(319)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',319);">&nbsp;</span
></td><td id="319"><a href="#319">319</a></td></tr
><tr id="gr_svn14_320"

 onmouseover="gutterOver(320)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',320);">&nbsp;</span
></td><td id="320"><a href="#320">320</a></td></tr
><tr id="gr_svn14_321"

 onmouseover="gutterOver(321)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',321);">&nbsp;</span
></td><td id="321"><a href="#321">321</a></td></tr
><tr id="gr_svn14_322"

 onmouseover="gutterOver(322)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',322);">&nbsp;</span
></td><td id="322"><a href="#322">322</a></td></tr
><tr id="gr_svn14_323"

 onmouseover="gutterOver(323)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',323);">&nbsp;</span
></td><td id="323"><a href="#323">323</a></td></tr
><tr id="gr_svn14_324"

 onmouseover="gutterOver(324)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',324);">&nbsp;</span
></td><td id="324"><a href="#324">324</a></td></tr
><tr id="gr_svn14_325"

 onmouseover="gutterOver(325)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',325);">&nbsp;</span
></td><td id="325"><a href="#325">325</a></td></tr
><tr id="gr_svn14_326"

 onmouseover="gutterOver(326)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',326);">&nbsp;</span
></td><td id="326"><a href="#326">326</a></td></tr
><tr id="gr_svn14_327"

 onmouseover="gutterOver(327)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',327);">&nbsp;</span
></td><td id="327"><a href="#327">327</a></td></tr
><tr id="gr_svn14_328"

 onmouseover="gutterOver(328)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',328);">&nbsp;</span
></td><td id="328"><a href="#328">328</a></td></tr
><tr id="gr_svn14_329"

 onmouseover="gutterOver(329)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',329);">&nbsp;</span
></td><td id="329"><a href="#329">329</a></td></tr
><tr id="gr_svn14_330"

 onmouseover="gutterOver(330)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',330);">&nbsp;</span
></td><td id="330"><a href="#330">330</a></td></tr
><tr id="gr_svn14_331"

 onmouseover="gutterOver(331)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',331);">&nbsp;</span
></td><td id="331"><a href="#331">331</a></td></tr
><tr id="gr_svn14_332"

 onmouseover="gutterOver(332)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',332);">&nbsp;</span
></td><td id="332"><a href="#332">332</a></td></tr
><tr id="gr_svn14_333"

 onmouseover="gutterOver(333)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',333);">&nbsp;</span
></td><td id="333"><a href="#333">333</a></td></tr
><tr id="gr_svn14_334"

 onmouseover="gutterOver(334)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',334);">&nbsp;</span
></td><td id="334"><a href="#334">334</a></td></tr
><tr id="gr_svn14_335"

 onmouseover="gutterOver(335)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',335);">&nbsp;</span
></td><td id="335"><a href="#335">335</a></td></tr
><tr id="gr_svn14_336"

 onmouseover="gutterOver(336)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',336);">&nbsp;</span
></td><td id="336"><a href="#336">336</a></td></tr
><tr id="gr_svn14_337"

 onmouseover="gutterOver(337)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',337);">&nbsp;</span
></td><td id="337"><a href="#337">337</a></td></tr
><tr id="gr_svn14_338"

 onmouseover="gutterOver(338)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',338);">&nbsp;</span
></td><td id="338"><a href="#338">338</a></td></tr
><tr id="gr_svn14_339"

 onmouseover="gutterOver(339)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',339);">&nbsp;</span
></td><td id="339"><a href="#339">339</a></td></tr
><tr id="gr_svn14_340"

 onmouseover="gutterOver(340)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',340);">&nbsp;</span
></td><td id="340"><a href="#340">340</a></td></tr
><tr id="gr_svn14_341"

 onmouseover="gutterOver(341)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',341);">&nbsp;</span
></td><td id="341"><a href="#341">341</a></td></tr
><tr id="gr_svn14_342"

 onmouseover="gutterOver(342)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',342);">&nbsp;</span
></td><td id="342"><a href="#342">342</a></td></tr
><tr id="gr_svn14_343"

 onmouseover="gutterOver(343)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',343);">&nbsp;</span
></td><td id="343"><a href="#343">343</a></td></tr
><tr id="gr_svn14_344"

 onmouseover="gutterOver(344)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',344);">&nbsp;</span
></td><td id="344"><a href="#344">344</a></td></tr
><tr id="gr_svn14_345"

 onmouseover="gutterOver(345)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',345);">&nbsp;</span
></td><td id="345"><a href="#345">345</a></td></tr
><tr id="gr_svn14_346"

 onmouseover="gutterOver(346)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',346);">&nbsp;</span
></td><td id="346"><a href="#346">346</a></td></tr
><tr id="gr_svn14_347"

 onmouseover="gutterOver(347)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',347);">&nbsp;</span
></td><td id="347"><a href="#347">347</a></td></tr
><tr id="gr_svn14_348"

 onmouseover="gutterOver(348)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',348);">&nbsp;</span
></td><td id="348"><a href="#348">348</a></td></tr
><tr id="gr_svn14_349"

 onmouseover="gutterOver(349)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',349);">&nbsp;</span
></td><td id="349"><a href="#349">349</a></td></tr
><tr id="gr_svn14_350"

 onmouseover="gutterOver(350)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',350);">&nbsp;</span
></td><td id="350"><a href="#350">350</a></td></tr
><tr id="gr_svn14_351"

 onmouseover="gutterOver(351)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',351);">&nbsp;</span
></td><td id="351"><a href="#351">351</a></td></tr
><tr id="gr_svn14_352"

 onmouseover="gutterOver(352)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',352);">&nbsp;</span
></td><td id="352"><a href="#352">352</a></td></tr
><tr id="gr_svn14_353"

 onmouseover="gutterOver(353)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',353);">&nbsp;</span
></td><td id="353"><a href="#353">353</a></td></tr
><tr id="gr_svn14_354"

 onmouseover="gutterOver(354)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',354);">&nbsp;</span
></td><td id="354"><a href="#354">354</a></td></tr
><tr id="gr_svn14_355"

 onmouseover="gutterOver(355)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',355);">&nbsp;</span
></td><td id="355"><a href="#355">355</a></td></tr
><tr id="gr_svn14_356"

 onmouseover="gutterOver(356)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',356);">&nbsp;</span
></td><td id="356"><a href="#356">356</a></td></tr
><tr id="gr_svn14_357"

 onmouseover="gutterOver(357)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',357);">&nbsp;</span
></td><td id="357"><a href="#357">357</a></td></tr
><tr id="gr_svn14_358"

 onmouseover="gutterOver(358)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',358);">&nbsp;</span
></td><td id="358"><a href="#358">358</a></td></tr
><tr id="gr_svn14_359"

 onmouseover="gutterOver(359)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',359);">&nbsp;</span
></td><td id="359"><a href="#359">359</a></td></tr
><tr id="gr_svn14_360"

 onmouseover="gutterOver(360)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',360);">&nbsp;</span
></td><td id="360"><a href="#360">360</a></td></tr
><tr id="gr_svn14_361"

 onmouseover="gutterOver(361)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',361);">&nbsp;</span
></td><td id="361"><a href="#361">361</a></td></tr
><tr id="gr_svn14_362"

 onmouseover="gutterOver(362)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',362);">&nbsp;</span
></td><td id="362"><a href="#362">362</a></td></tr
><tr id="gr_svn14_363"

 onmouseover="gutterOver(363)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',363);">&nbsp;</span
></td><td id="363"><a href="#363">363</a></td></tr
><tr id="gr_svn14_364"

 onmouseover="gutterOver(364)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',364);">&nbsp;</span
></td><td id="364"><a href="#364">364</a></td></tr
><tr id="gr_svn14_365"

 onmouseover="gutterOver(365)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',365);">&nbsp;</span
></td><td id="365"><a href="#365">365</a></td></tr
><tr id="gr_svn14_366"

 onmouseover="gutterOver(366)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',366);">&nbsp;</span
></td><td id="366"><a href="#366">366</a></td></tr
><tr id="gr_svn14_367"

 onmouseover="gutterOver(367)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',367);">&nbsp;</span
></td><td id="367"><a href="#367">367</a></td></tr
><tr id="gr_svn14_368"

 onmouseover="gutterOver(368)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',368);">&nbsp;</span
></td><td id="368"><a href="#368">368</a></td></tr
><tr id="gr_svn14_369"

 onmouseover="gutterOver(369)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',369);">&nbsp;</span
></td><td id="369"><a href="#369">369</a></td></tr
><tr id="gr_svn14_370"

 onmouseover="gutterOver(370)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',370);">&nbsp;</span
></td><td id="370"><a href="#370">370</a></td></tr
><tr id="gr_svn14_371"

 onmouseover="gutterOver(371)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',371);">&nbsp;</span
></td><td id="371"><a href="#371">371</a></td></tr
><tr id="gr_svn14_372"

 onmouseover="gutterOver(372)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',372);">&nbsp;</span
></td><td id="372"><a href="#372">372</a></td></tr
><tr id="gr_svn14_373"

 onmouseover="gutterOver(373)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',373);">&nbsp;</span
></td><td id="373"><a href="#373">373</a></td></tr
><tr id="gr_svn14_374"

 onmouseover="gutterOver(374)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',374);">&nbsp;</span
></td><td id="374"><a href="#374">374</a></td></tr
><tr id="gr_svn14_375"

 onmouseover="gutterOver(375)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',375);">&nbsp;</span
></td><td id="375"><a href="#375">375</a></td></tr
><tr id="gr_svn14_376"

 onmouseover="gutterOver(376)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',376);">&nbsp;</span
></td><td id="376"><a href="#376">376</a></td></tr
><tr id="gr_svn14_377"

 onmouseover="gutterOver(377)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',377);">&nbsp;</span
></td><td id="377"><a href="#377">377</a></td></tr
><tr id="gr_svn14_378"

 onmouseover="gutterOver(378)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',378);">&nbsp;</span
></td><td id="378"><a href="#378">378</a></td></tr
><tr id="gr_svn14_379"

 onmouseover="gutterOver(379)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',379);">&nbsp;</span
></td><td id="379"><a href="#379">379</a></td></tr
><tr id="gr_svn14_380"

 onmouseover="gutterOver(380)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',380);">&nbsp;</span
></td><td id="380"><a href="#380">380</a></td></tr
><tr id="gr_svn14_381"

 onmouseover="gutterOver(381)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',381);">&nbsp;</span
></td><td id="381"><a href="#381">381</a></td></tr
><tr id="gr_svn14_382"

 onmouseover="gutterOver(382)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',382);">&nbsp;</span
></td><td id="382"><a href="#382">382</a></td></tr
><tr id="gr_svn14_383"

 onmouseover="gutterOver(383)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',383);">&nbsp;</span
></td><td id="383"><a href="#383">383</a></td></tr
><tr id="gr_svn14_384"

 onmouseover="gutterOver(384)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',384);">&nbsp;</span
></td><td id="384"><a href="#384">384</a></td></tr
><tr id="gr_svn14_385"

 onmouseover="gutterOver(385)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',385);">&nbsp;</span
></td><td id="385"><a href="#385">385</a></td></tr
><tr id="gr_svn14_386"

 onmouseover="gutterOver(386)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',386);">&nbsp;</span
></td><td id="386"><a href="#386">386</a></td></tr
><tr id="gr_svn14_387"

 onmouseover="gutterOver(387)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',387);">&nbsp;</span
></td><td id="387"><a href="#387">387</a></td></tr
><tr id="gr_svn14_388"

 onmouseover="gutterOver(388)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',388);">&nbsp;</span
></td><td id="388"><a href="#388">388</a></td></tr
><tr id="gr_svn14_389"

 onmouseover="gutterOver(389)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',389);">&nbsp;</span
></td><td id="389"><a href="#389">389</a></td></tr
><tr id="gr_svn14_390"

 onmouseover="gutterOver(390)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',390);">&nbsp;</span
></td><td id="390"><a href="#390">390</a></td></tr
><tr id="gr_svn14_391"

 onmouseover="gutterOver(391)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',391);">&nbsp;</span
></td><td id="391"><a href="#391">391</a></td></tr
><tr id="gr_svn14_392"

 onmouseover="gutterOver(392)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',392);">&nbsp;</span
></td><td id="392"><a href="#392">392</a></td></tr
><tr id="gr_svn14_393"

 onmouseover="gutterOver(393)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',393);">&nbsp;</span
></td><td id="393"><a href="#393">393</a></td></tr
><tr id="gr_svn14_394"

 onmouseover="gutterOver(394)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',394);">&nbsp;</span
></td><td id="394"><a href="#394">394</a></td></tr
><tr id="gr_svn14_395"

 onmouseover="gutterOver(395)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',395);">&nbsp;</span
></td><td id="395"><a href="#395">395</a></td></tr
><tr id="gr_svn14_396"

 onmouseover="gutterOver(396)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',396);">&nbsp;</span
></td><td id="396"><a href="#396">396</a></td></tr
><tr id="gr_svn14_397"

 onmouseover="gutterOver(397)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',397);">&nbsp;</span
></td><td id="397"><a href="#397">397</a></td></tr
><tr id="gr_svn14_398"

 onmouseover="gutterOver(398)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',398);">&nbsp;</span
></td><td id="398"><a href="#398">398</a></td></tr
><tr id="gr_svn14_399"

 onmouseover="gutterOver(399)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',399);">&nbsp;</span
></td><td id="399"><a href="#399">399</a></td></tr
><tr id="gr_svn14_400"

 onmouseover="gutterOver(400)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',400);">&nbsp;</span
></td><td id="400"><a href="#400">400</a></td></tr
><tr id="gr_svn14_401"

 onmouseover="gutterOver(401)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',401);">&nbsp;</span
></td><td id="401"><a href="#401">401</a></td></tr
><tr id="gr_svn14_402"

 onmouseover="gutterOver(402)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',402);">&nbsp;</span
></td><td id="402"><a href="#402">402</a></td></tr
><tr id="gr_svn14_403"

 onmouseover="gutterOver(403)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',403);">&nbsp;</span
></td><td id="403"><a href="#403">403</a></td></tr
><tr id="gr_svn14_404"

 onmouseover="gutterOver(404)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',404);">&nbsp;</span
></td><td id="404"><a href="#404">404</a></td></tr
><tr id="gr_svn14_405"

 onmouseover="gutterOver(405)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',405);">&nbsp;</span
></td><td id="405"><a href="#405">405</a></td></tr
><tr id="gr_svn14_406"

 onmouseover="gutterOver(406)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',406);">&nbsp;</span
></td><td id="406"><a href="#406">406</a></td></tr
><tr id="gr_svn14_407"

 onmouseover="gutterOver(407)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',407);">&nbsp;</span
></td><td id="407"><a href="#407">407</a></td></tr
><tr id="gr_svn14_408"

 onmouseover="gutterOver(408)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',408);">&nbsp;</span
></td><td id="408"><a href="#408">408</a></td></tr
><tr id="gr_svn14_409"

 onmouseover="gutterOver(409)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',409);">&nbsp;</span
></td><td id="409"><a href="#409">409</a></td></tr
><tr id="gr_svn14_410"

 onmouseover="gutterOver(410)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',410);">&nbsp;</span
></td><td id="410"><a href="#410">410</a></td></tr
><tr id="gr_svn14_411"

 onmouseover="gutterOver(411)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',411);">&nbsp;</span
></td><td id="411"><a href="#411">411</a></td></tr
><tr id="gr_svn14_412"

 onmouseover="gutterOver(412)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',412);">&nbsp;</span
></td><td id="412"><a href="#412">412</a></td></tr
><tr id="gr_svn14_413"

 onmouseover="gutterOver(413)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',413);">&nbsp;</span
></td><td id="413"><a href="#413">413</a></td></tr
><tr id="gr_svn14_414"

 onmouseover="gutterOver(414)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',414);">&nbsp;</span
></td><td id="414"><a href="#414">414</a></td></tr
><tr id="gr_svn14_415"

 onmouseover="gutterOver(415)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',415);">&nbsp;</span
></td><td id="415"><a href="#415">415</a></td></tr
><tr id="gr_svn14_416"

 onmouseover="gutterOver(416)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',416);">&nbsp;</span
></td><td id="416"><a href="#416">416</a></td></tr
><tr id="gr_svn14_417"

 onmouseover="gutterOver(417)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',417);">&nbsp;</span
></td><td id="417"><a href="#417">417</a></td></tr
><tr id="gr_svn14_418"

 onmouseover="gutterOver(418)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',418);">&nbsp;</span
></td><td id="418"><a href="#418">418</a></td></tr
><tr id="gr_svn14_419"

 onmouseover="gutterOver(419)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',419);">&nbsp;</span
></td><td id="419"><a href="#419">419</a></td></tr
><tr id="gr_svn14_420"

 onmouseover="gutterOver(420)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',420);">&nbsp;</span
></td><td id="420"><a href="#420">420</a></td></tr
><tr id="gr_svn14_421"

 onmouseover="gutterOver(421)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',421);">&nbsp;</span
></td><td id="421"><a href="#421">421</a></td></tr
><tr id="gr_svn14_422"

 onmouseover="gutterOver(422)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',422);">&nbsp;</span
></td><td id="422"><a href="#422">422</a></td></tr
><tr id="gr_svn14_423"

 onmouseover="gutterOver(423)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',423);">&nbsp;</span
></td><td id="423"><a href="#423">423</a></td></tr
><tr id="gr_svn14_424"

 onmouseover="gutterOver(424)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',424);">&nbsp;</span
></td><td id="424"><a href="#424">424</a></td></tr
><tr id="gr_svn14_425"

 onmouseover="gutterOver(425)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',425);">&nbsp;</span
></td><td id="425"><a href="#425">425</a></td></tr
><tr id="gr_svn14_426"

 onmouseover="gutterOver(426)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',426);">&nbsp;</span
></td><td id="426"><a href="#426">426</a></td></tr
><tr id="gr_svn14_427"

 onmouseover="gutterOver(427)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',427);">&nbsp;</span
></td><td id="427"><a href="#427">427</a></td></tr
><tr id="gr_svn14_428"

 onmouseover="gutterOver(428)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',428);">&nbsp;</span
></td><td id="428"><a href="#428">428</a></td></tr
><tr id="gr_svn14_429"

 onmouseover="gutterOver(429)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',429);">&nbsp;</span
></td><td id="429"><a href="#429">429</a></td></tr
><tr id="gr_svn14_430"

 onmouseover="gutterOver(430)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',430);">&nbsp;</span
></td><td id="430"><a href="#430">430</a></td></tr
><tr id="gr_svn14_431"

 onmouseover="gutterOver(431)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',431);">&nbsp;</span
></td><td id="431"><a href="#431">431</a></td></tr
><tr id="gr_svn14_432"

 onmouseover="gutterOver(432)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',432);">&nbsp;</span
></td><td id="432"><a href="#432">432</a></td></tr
><tr id="gr_svn14_433"

 onmouseover="gutterOver(433)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',433);">&nbsp;</span
></td><td id="433"><a href="#433">433</a></td></tr
><tr id="gr_svn14_434"

 onmouseover="gutterOver(434)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',434);">&nbsp;</span
></td><td id="434"><a href="#434">434</a></td></tr
><tr id="gr_svn14_435"

 onmouseover="gutterOver(435)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',435);">&nbsp;</span
></td><td id="435"><a href="#435">435</a></td></tr
><tr id="gr_svn14_436"

 onmouseover="gutterOver(436)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',436);">&nbsp;</span
></td><td id="436"><a href="#436">436</a></td></tr
><tr id="gr_svn14_437"

 onmouseover="gutterOver(437)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',437);">&nbsp;</span
></td><td id="437"><a href="#437">437</a></td></tr
><tr id="gr_svn14_438"

 onmouseover="gutterOver(438)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',438);">&nbsp;</span
></td><td id="438"><a href="#438">438</a></td></tr
><tr id="gr_svn14_439"

 onmouseover="gutterOver(439)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',439);">&nbsp;</span
></td><td id="439"><a href="#439">439</a></td></tr
><tr id="gr_svn14_440"

 onmouseover="gutterOver(440)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',440);">&nbsp;</span
></td><td id="440"><a href="#440">440</a></td></tr
><tr id="gr_svn14_441"

 onmouseover="gutterOver(441)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',441);">&nbsp;</span
></td><td id="441"><a href="#441">441</a></td></tr
><tr id="gr_svn14_442"

 onmouseover="gutterOver(442)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',442);">&nbsp;</span
></td><td id="442"><a href="#442">442</a></td></tr
><tr id="gr_svn14_443"

 onmouseover="gutterOver(443)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',443);">&nbsp;</span
></td><td id="443"><a href="#443">443</a></td></tr
><tr id="gr_svn14_444"

 onmouseover="gutterOver(444)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',444);">&nbsp;</span
></td><td id="444"><a href="#444">444</a></td></tr
><tr id="gr_svn14_445"

 onmouseover="gutterOver(445)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',445);">&nbsp;</span
></td><td id="445"><a href="#445">445</a></td></tr
><tr id="gr_svn14_446"

 onmouseover="gutterOver(446)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',446);">&nbsp;</span
></td><td id="446"><a href="#446">446</a></td></tr
><tr id="gr_svn14_447"

 onmouseover="gutterOver(447)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',447);">&nbsp;</span
></td><td id="447"><a href="#447">447</a></td></tr
><tr id="gr_svn14_448"

 onmouseover="gutterOver(448)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',448);">&nbsp;</span
></td><td id="448"><a href="#448">448</a></td></tr
><tr id="gr_svn14_449"

 onmouseover="gutterOver(449)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',449);">&nbsp;</span
></td><td id="449"><a href="#449">449</a></td></tr
><tr id="gr_svn14_450"

 onmouseover="gutterOver(450)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',450);">&nbsp;</span
></td><td id="450"><a href="#450">450</a></td></tr
><tr id="gr_svn14_451"

 onmouseover="gutterOver(451)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',451);">&nbsp;</span
></td><td id="451"><a href="#451">451</a></td></tr
><tr id="gr_svn14_452"

 onmouseover="gutterOver(452)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',452);">&nbsp;</span
></td><td id="452"><a href="#452">452</a></td></tr
><tr id="gr_svn14_453"

 onmouseover="gutterOver(453)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',453);">&nbsp;</span
></td><td id="453"><a href="#453">453</a></td></tr
><tr id="gr_svn14_454"

 onmouseover="gutterOver(454)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',454);">&nbsp;</span
></td><td id="454"><a href="#454">454</a></td></tr
><tr id="gr_svn14_455"

 onmouseover="gutterOver(455)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',455);">&nbsp;</span
></td><td id="455"><a href="#455">455</a></td></tr
><tr id="gr_svn14_456"

 onmouseover="gutterOver(456)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',456);">&nbsp;</span
></td><td id="456"><a href="#456">456</a></td></tr
><tr id="gr_svn14_457"

 onmouseover="gutterOver(457)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',457);">&nbsp;</span
></td><td id="457"><a href="#457">457</a></td></tr
><tr id="gr_svn14_458"

 onmouseover="gutterOver(458)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',458);">&nbsp;</span
></td><td id="458"><a href="#458">458</a></td></tr
><tr id="gr_svn14_459"

 onmouseover="gutterOver(459)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',459);">&nbsp;</span
></td><td id="459"><a href="#459">459</a></td></tr
><tr id="gr_svn14_460"

 onmouseover="gutterOver(460)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',460);">&nbsp;</span
></td><td id="460"><a href="#460">460</a></td></tr
><tr id="gr_svn14_461"

 onmouseover="gutterOver(461)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',461);">&nbsp;</span
></td><td id="461"><a href="#461">461</a></td></tr
><tr id="gr_svn14_462"

 onmouseover="gutterOver(462)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',462);">&nbsp;</span
></td><td id="462"><a href="#462">462</a></td></tr
><tr id="gr_svn14_463"

 onmouseover="gutterOver(463)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',463);">&nbsp;</span
></td><td id="463"><a href="#463">463</a></td></tr
><tr id="gr_svn14_464"

 onmouseover="gutterOver(464)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',464);">&nbsp;</span
></td><td id="464"><a href="#464">464</a></td></tr
><tr id="gr_svn14_465"

 onmouseover="gutterOver(465)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',465);">&nbsp;</span
></td><td id="465"><a href="#465">465</a></td></tr
><tr id="gr_svn14_466"

 onmouseover="gutterOver(466)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',466);">&nbsp;</span
></td><td id="466"><a href="#466">466</a></td></tr
><tr id="gr_svn14_467"

 onmouseover="gutterOver(467)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',467);">&nbsp;</span
></td><td id="467"><a href="#467">467</a></td></tr
><tr id="gr_svn14_468"

 onmouseover="gutterOver(468)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',468);">&nbsp;</span
></td><td id="468"><a href="#468">468</a></td></tr
><tr id="gr_svn14_469"

 onmouseover="gutterOver(469)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',469);">&nbsp;</span
></td><td id="469"><a href="#469">469</a></td></tr
><tr id="gr_svn14_470"

 onmouseover="gutterOver(470)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',470);">&nbsp;</span
></td><td id="470"><a href="#470">470</a></td></tr
><tr id="gr_svn14_471"

 onmouseover="gutterOver(471)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',471);">&nbsp;</span
></td><td id="471"><a href="#471">471</a></td></tr
><tr id="gr_svn14_472"

 onmouseover="gutterOver(472)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',472);">&nbsp;</span
></td><td id="472"><a href="#472">472</a></td></tr
><tr id="gr_svn14_473"

 onmouseover="gutterOver(473)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',473);">&nbsp;</span
></td><td id="473"><a href="#473">473</a></td></tr
><tr id="gr_svn14_474"

 onmouseover="gutterOver(474)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',474);">&nbsp;</span
></td><td id="474"><a href="#474">474</a></td></tr
><tr id="gr_svn14_475"

 onmouseover="gutterOver(475)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',475);">&nbsp;</span
></td><td id="475"><a href="#475">475</a></td></tr
><tr id="gr_svn14_476"

 onmouseover="gutterOver(476)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',476);">&nbsp;</span
></td><td id="476"><a href="#476">476</a></td></tr
><tr id="gr_svn14_477"

 onmouseover="gutterOver(477)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',477);">&nbsp;</span
></td><td id="477"><a href="#477">477</a></td></tr
><tr id="gr_svn14_478"

 onmouseover="gutterOver(478)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',478);">&nbsp;</span
></td><td id="478"><a href="#478">478</a></td></tr
><tr id="gr_svn14_479"

 onmouseover="gutterOver(479)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',479);">&nbsp;</span
></td><td id="479"><a href="#479">479</a></td></tr
><tr id="gr_svn14_480"

 onmouseover="gutterOver(480)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',480);">&nbsp;</span
></td><td id="480"><a href="#480">480</a></td></tr
><tr id="gr_svn14_481"

 onmouseover="gutterOver(481)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',481);">&nbsp;</span
></td><td id="481"><a href="#481">481</a></td></tr
><tr id="gr_svn14_482"

 onmouseover="gutterOver(482)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',482);">&nbsp;</span
></td><td id="482"><a href="#482">482</a></td></tr
><tr id="gr_svn14_483"

 onmouseover="gutterOver(483)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',483);">&nbsp;</span
></td><td id="483"><a href="#483">483</a></td></tr
><tr id="gr_svn14_484"

 onmouseover="gutterOver(484)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',484);">&nbsp;</span
></td><td id="484"><a href="#484">484</a></td></tr
><tr id="gr_svn14_485"

 onmouseover="gutterOver(485)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',485);">&nbsp;</span
></td><td id="485"><a href="#485">485</a></td></tr
><tr id="gr_svn14_486"

 onmouseover="gutterOver(486)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',486);">&nbsp;</span
></td><td id="486"><a href="#486">486</a></td></tr
><tr id="gr_svn14_487"

 onmouseover="gutterOver(487)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',487);">&nbsp;</span
></td><td id="487"><a href="#487">487</a></td></tr
><tr id="gr_svn14_488"

 onmouseover="gutterOver(488)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',488);">&nbsp;</span
></td><td id="488"><a href="#488">488</a></td></tr
><tr id="gr_svn14_489"

 onmouseover="gutterOver(489)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',489);">&nbsp;</span
></td><td id="489"><a href="#489">489</a></td></tr
><tr id="gr_svn14_490"

 onmouseover="gutterOver(490)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',490);">&nbsp;</span
></td><td id="490"><a href="#490">490</a></td></tr
><tr id="gr_svn14_491"

 onmouseover="gutterOver(491)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',491);">&nbsp;</span
></td><td id="491"><a href="#491">491</a></td></tr
><tr id="gr_svn14_492"

 onmouseover="gutterOver(492)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',492);">&nbsp;</span
></td><td id="492"><a href="#492">492</a></td></tr
><tr id="gr_svn14_493"

 onmouseover="gutterOver(493)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',493);">&nbsp;</span
></td><td id="493"><a href="#493">493</a></td></tr
><tr id="gr_svn14_494"

 onmouseover="gutterOver(494)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',494);">&nbsp;</span
></td><td id="494"><a href="#494">494</a></td></tr
><tr id="gr_svn14_495"

 onmouseover="gutterOver(495)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',495);">&nbsp;</span
></td><td id="495"><a href="#495">495</a></td></tr
><tr id="gr_svn14_496"

 onmouseover="gutterOver(496)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',496);">&nbsp;</span
></td><td id="496"><a href="#496">496</a></td></tr
><tr id="gr_svn14_497"

 onmouseover="gutterOver(497)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',497);">&nbsp;</span
></td><td id="497"><a href="#497">497</a></td></tr
><tr id="gr_svn14_498"

 onmouseover="gutterOver(498)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',498);">&nbsp;</span
></td><td id="498"><a href="#498">498</a></td></tr
><tr id="gr_svn14_499"

 onmouseover="gutterOver(499)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',499);">&nbsp;</span
></td><td id="499"><a href="#499">499</a></td></tr
><tr id="gr_svn14_500"

 onmouseover="gutterOver(500)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',500);">&nbsp;</span
></td><td id="500"><a href="#500">500</a></td></tr
><tr id="gr_svn14_501"

 onmouseover="gutterOver(501)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',501);">&nbsp;</span
></td><td id="501"><a href="#501">501</a></td></tr
><tr id="gr_svn14_502"

 onmouseover="gutterOver(502)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',502);">&nbsp;</span
></td><td id="502"><a href="#502">502</a></td></tr
><tr id="gr_svn14_503"

 onmouseover="gutterOver(503)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',503);">&nbsp;</span
></td><td id="503"><a href="#503">503</a></td></tr
><tr id="gr_svn14_504"

 onmouseover="gutterOver(504)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',504);">&nbsp;</span
></td><td id="504"><a href="#504">504</a></td></tr
><tr id="gr_svn14_505"

 onmouseover="gutterOver(505)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',505);">&nbsp;</span
></td><td id="505"><a href="#505">505</a></td></tr
><tr id="gr_svn14_506"

 onmouseover="gutterOver(506)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',506);">&nbsp;</span
></td><td id="506"><a href="#506">506</a></td></tr
><tr id="gr_svn14_507"

 onmouseover="gutterOver(507)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',507);">&nbsp;</span
></td><td id="507"><a href="#507">507</a></td></tr
><tr id="gr_svn14_508"

 onmouseover="gutterOver(508)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',508);">&nbsp;</span
></td><td id="508"><a href="#508">508</a></td></tr
><tr id="gr_svn14_509"

 onmouseover="gutterOver(509)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',509);">&nbsp;</span
></td><td id="509"><a href="#509">509</a></td></tr
><tr id="gr_svn14_510"

 onmouseover="gutterOver(510)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',510);">&nbsp;</span
></td><td id="510"><a href="#510">510</a></td></tr
><tr id="gr_svn14_511"

 onmouseover="gutterOver(511)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',511);">&nbsp;</span
></td><td id="511"><a href="#511">511</a></td></tr
><tr id="gr_svn14_512"

 onmouseover="gutterOver(512)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',512);">&nbsp;</span
></td><td id="512"><a href="#512">512</a></td></tr
><tr id="gr_svn14_513"

 onmouseover="gutterOver(513)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',513);">&nbsp;</span
></td><td id="513"><a href="#513">513</a></td></tr
><tr id="gr_svn14_514"

 onmouseover="gutterOver(514)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',514);">&nbsp;</span
></td><td id="514"><a href="#514">514</a></td></tr
><tr id="gr_svn14_515"

 onmouseover="gutterOver(515)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',515);">&nbsp;</span
></td><td id="515"><a href="#515">515</a></td></tr
><tr id="gr_svn14_516"

 onmouseover="gutterOver(516)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',516);">&nbsp;</span
></td><td id="516"><a href="#516">516</a></td></tr
><tr id="gr_svn14_517"

 onmouseover="gutterOver(517)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',517);">&nbsp;</span
></td><td id="517"><a href="#517">517</a></td></tr
><tr id="gr_svn14_518"

 onmouseover="gutterOver(518)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',518);">&nbsp;</span
></td><td id="518"><a href="#518">518</a></td></tr
><tr id="gr_svn14_519"

 onmouseover="gutterOver(519)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',519);">&nbsp;</span
></td><td id="519"><a href="#519">519</a></td></tr
><tr id="gr_svn14_520"

 onmouseover="gutterOver(520)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',520);">&nbsp;</span
></td><td id="520"><a href="#520">520</a></td></tr
><tr id="gr_svn14_521"

 onmouseover="gutterOver(521)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',521);">&nbsp;</span
></td><td id="521"><a href="#521">521</a></td></tr
><tr id="gr_svn14_522"

 onmouseover="gutterOver(522)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',522);">&nbsp;</span
></td><td id="522"><a href="#522">522</a></td></tr
><tr id="gr_svn14_523"

 onmouseover="gutterOver(523)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',523);">&nbsp;</span
></td><td id="523"><a href="#523">523</a></td></tr
><tr id="gr_svn14_524"

 onmouseover="gutterOver(524)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',524);">&nbsp;</span
></td><td id="524"><a href="#524">524</a></td></tr
><tr id="gr_svn14_525"

 onmouseover="gutterOver(525)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',525);">&nbsp;</span
></td><td id="525"><a href="#525">525</a></td></tr
><tr id="gr_svn14_526"

 onmouseover="gutterOver(526)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',526);">&nbsp;</span
></td><td id="526"><a href="#526">526</a></td></tr
><tr id="gr_svn14_527"

 onmouseover="gutterOver(527)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',527);">&nbsp;</span
></td><td id="527"><a href="#527">527</a></td></tr
><tr id="gr_svn14_528"

 onmouseover="gutterOver(528)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',528);">&nbsp;</span
></td><td id="528"><a href="#528">528</a></td></tr
><tr id="gr_svn14_529"

 onmouseover="gutterOver(529)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',529);">&nbsp;</span
></td><td id="529"><a href="#529">529</a></td></tr
><tr id="gr_svn14_530"

 onmouseover="gutterOver(530)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',530);">&nbsp;</span
></td><td id="530"><a href="#530">530</a></td></tr
><tr id="gr_svn14_531"

 onmouseover="gutterOver(531)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',531);">&nbsp;</span
></td><td id="531"><a href="#531">531</a></td></tr
><tr id="gr_svn14_532"

 onmouseover="gutterOver(532)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',532);">&nbsp;</span
></td><td id="532"><a href="#532">532</a></td></tr
><tr id="gr_svn14_533"

 onmouseover="gutterOver(533)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',533);">&nbsp;</span
></td><td id="533"><a href="#533">533</a></td></tr
><tr id="gr_svn14_534"

 onmouseover="gutterOver(534)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',534);">&nbsp;</span
></td><td id="534"><a href="#534">534</a></td></tr
><tr id="gr_svn14_535"

 onmouseover="gutterOver(535)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',535);">&nbsp;</span
></td><td id="535"><a href="#535">535</a></td></tr
><tr id="gr_svn14_536"

 onmouseover="gutterOver(536)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',536);">&nbsp;</span
></td><td id="536"><a href="#536">536</a></td></tr
><tr id="gr_svn14_537"

 onmouseover="gutterOver(537)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',537);">&nbsp;</span
></td><td id="537"><a href="#537">537</a></td></tr
><tr id="gr_svn14_538"

 onmouseover="gutterOver(538)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',538);">&nbsp;</span
></td><td id="538"><a href="#538">538</a></td></tr
><tr id="gr_svn14_539"

 onmouseover="gutterOver(539)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',539);">&nbsp;</span
></td><td id="539"><a href="#539">539</a></td></tr
><tr id="gr_svn14_540"

 onmouseover="gutterOver(540)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',540);">&nbsp;</span
></td><td id="540"><a href="#540">540</a></td></tr
><tr id="gr_svn14_541"

 onmouseover="gutterOver(541)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',541);">&nbsp;</span
></td><td id="541"><a href="#541">541</a></td></tr
><tr id="gr_svn14_542"

 onmouseover="gutterOver(542)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',542);">&nbsp;</span
></td><td id="542"><a href="#542">542</a></td></tr
><tr id="gr_svn14_543"

 onmouseover="gutterOver(543)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',543);">&nbsp;</span
></td><td id="543"><a href="#543">543</a></td></tr
><tr id="gr_svn14_544"

 onmouseover="gutterOver(544)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',544);">&nbsp;</span
></td><td id="544"><a href="#544">544</a></td></tr
><tr id="gr_svn14_545"

 onmouseover="gutterOver(545)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',545);">&nbsp;</span
></td><td id="545"><a href="#545">545</a></td></tr
><tr id="gr_svn14_546"

 onmouseover="gutterOver(546)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',546);">&nbsp;</span
></td><td id="546"><a href="#546">546</a></td></tr
><tr id="gr_svn14_547"

 onmouseover="gutterOver(547)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',547);">&nbsp;</span
></td><td id="547"><a href="#547">547</a></td></tr
><tr id="gr_svn14_548"

 onmouseover="gutterOver(548)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',548);">&nbsp;</span
></td><td id="548"><a href="#548">548</a></td></tr
><tr id="gr_svn14_549"

 onmouseover="gutterOver(549)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',549);">&nbsp;</span
></td><td id="549"><a href="#549">549</a></td></tr
><tr id="gr_svn14_550"

 onmouseover="gutterOver(550)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',550);">&nbsp;</span
></td><td id="550"><a href="#550">550</a></td></tr
><tr id="gr_svn14_551"

 onmouseover="gutterOver(551)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',551);">&nbsp;</span
></td><td id="551"><a href="#551">551</a></td></tr
><tr id="gr_svn14_552"

 onmouseover="gutterOver(552)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',552);">&nbsp;</span
></td><td id="552"><a href="#552">552</a></td></tr
><tr id="gr_svn14_553"

 onmouseover="gutterOver(553)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',553);">&nbsp;</span
></td><td id="553"><a href="#553">553</a></td></tr
><tr id="gr_svn14_554"

 onmouseover="gutterOver(554)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',554);">&nbsp;</span
></td><td id="554"><a href="#554">554</a></td></tr
><tr id="gr_svn14_555"

 onmouseover="gutterOver(555)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',555);">&nbsp;</span
></td><td id="555"><a href="#555">555</a></td></tr
><tr id="gr_svn14_556"

 onmouseover="gutterOver(556)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',556);">&nbsp;</span
></td><td id="556"><a href="#556">556</a></td></tr
><tr id="gr_svn14_557"

 onmouseover="gutterOver(557)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',557);">&nbsp;</span
></td><td id="557"><a href="#557">557</a></td></tr
><tr id="gr_svn14_558"

 onmouseover="gutterOver(558)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',558);">&nbsp;</span
></td><td id="558"><a href="#558">558</a></td></tr
><tr id="gr_svn14_559"

 onmouseover="gutterOver(559)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',559);">&nbsp;</span
></td><td id="559"><a href="#559">559</a></td></tr
><tr id="gr_svn14_560"

 onmouseover="gutterOver(560)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',560);">&nbsp;</span
></td><td id="560"><a href="#560">560</a></td></tr
><tr id="gr_svn14_561"

 onmouseover="gutterOver(561)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',561);">&nbsp;</span
></td><td id="561"><a href="#561">561</a></td></tr
><tr id="gr_svn14_562"

 onmouseover="gutterOver(562)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',562);">&nbsp;</span
></td><td id="562"><a href="#562">562</a></td></tr
><tr id="gr_svn14_563"

 onmouseover="gutterOver(563)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',563);">&nbsp;</span
></td><td id="563"><a href="#563">563</a></td></tr
><tr id="gr_svn14_564"

 onmouseover="gutterOver(564)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',564);">&nbsp;</span
></td><td id="564"><a href="#564">564</a></td></tr
><tr id="gr_svn14_565"

 onmouseover="gutterOver(565)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',565);">&nbsp;</span
></td><td id="565"><a href="#565">565</a></td></tr
><tr id="gr_svn14_566"

 onmouseover="gutterOver(566)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',566);">&nbsp;</span
></td><td id="566"><a href="#566">566</a></td></tr
><tr id="gr_svn14_567"

 onmouseover="gutterOver(567)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',567);">&nbsp;</span
></td><td id="567"><a href="#567">567</a></td></tr
><tr id="gr_svn14_568"

 onmouseover="gutterOver(568)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',568);">&nbsp;</span
></td><td id="568"><a href="#568">568</a></td></tr
><tr id="gr_svn14_569"

 onmouseover="gutterOver(569)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',569);">&nbsp;</span
></td><td id="569"><a href="#569">569</a></td></tr
><tr id="gr_svn14_570"

 onmouseover="gutterOver(570)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',570);">&nbsp;</span
></td><td id="570"><a href="#570">570</a></td></tr
><tr id="gr_svn14_571"

 onmouseover="gutterOver(571)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',571);">&nbsp;</span
></td><td id="571"><a href="#571">571</a></td></tr
><tr id="gr_svn14_572"

 onmouseover="gutterOver(572)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',572);">&nbsp;</span
></td><td id="572"><a href="#572">572</a></td></tr
><tr id="gr_svn14_573"

 onmouseover="gutterOver(573)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',573);">&nbsp;</span
></td><td id="573"><a href="#573">573</a></td></tr
><tr id="gr_svn14_574"

 onmouseover="gutterOver(574)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',574);">&nbsp;</span
></td><td id="574"><a href="#574">574</a></td></tr
><tr id="gr_svn14_575"

 onmouseover="gutterOver(575)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',575);">&nbsp;</span
></td><td id="575"><a href="#575">575</a></td></tr
><tr id="gr_svn14_576"

 onmouseover="gutterOver(576)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',576);">&nbsp;</span
></td><td id="576"><a href="#576">576</a></td></tr
><tr id="gr_svn14_577"

 onmouseover="gutterOver(577)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',577);">&nbsp;</span
></td><td id="577"><a href="#577">577</a></td></tr
><tr id="gr_svn14_578"

 onmouseover="gutterOver(578)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',578);">&nbsp;</span
></td><td id="578"><a href="#578">578</a></td></tr
><tr id="gr_svn14_579"

 onmouseover="gutterOver(579)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',579);">&nbsp;</span
></td><td id="579"><a href="#579">579</a></td></tr
><tr id="gr_svn14_580"

 onmouseover="gutterOver(580)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',580);">&nbsp;</span
></td><td id="580"><a href="#580">580</a></td></tr
><tr id="gr_svn14_581"

 onmouseover="gutterOver(581)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',581);">&nbsp;</span
></td><td id="581"><a href="#581">581</a></td></tr
><tr id="gr_svn14_582"

 onmouseover="gutterOver(582)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',582);">&nbsp;</span
></td><td id="582"><a href="#582">582</a></td></tr
><tr id="gr_svn14_583"

 onmouseover="gutterOver(583)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',583);">&nbsp;</span
></td><td id="583"><a href="#583">583</a></td></tr
><tr id="gr_svn14_584"

 onmouseover="gutterOver(584)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',584);">&nbsp;</span
></td><td id="584"><a href="#584">584</a></td></tr
><tr id="gr_svn14_585"

 onmouseover="gutterOver(585)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',585);">&nbsp;</span
></td><td id="585"><a href="#585">585</a></td></tr
><tr id="gr_svn14_586"

 onmouseover="gutterOver(586)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',586);">&nbsp;</span
></td><td id="586"><a href="#586">586</a></td></tr
><tr id="gr_svn14_587"

 onmouseover="gutterOver(587)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',587);">&nbsp;</span
></td><td id="587"><a href="#587">587</a></td></tr
><tr id="gr_svn14_588"

 onmouseover="gutterOver(588)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',588);">&nbsp;</span
></td><td id="588"><a href="#588">588</a></td></tr
><tr id="gr_svn14_589"

 onmouseover="gutterOver(589)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',589);">&nbsp;</span
></td><td id="589"><a href="#589">589</a></td></tr
><tr id="gr_svn14_590"

 onmouseover="gutterOver(590)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',590);">&nbsp;</span
></td><td id="590"><a href="#590">590</a></td></tr
><tr id="gr_svn14_591"

 onmouseover="gutterOver(591)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',591);">&nbsp;</span
></td><td id="591"><a href="#591">591</a></td></tr
><tr id="gr_svn14_592"

 onmouseover="gutterOver(592)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',592);">&nbsp;</span
></td><td id="592"><a href="#592">592</a></td></tr
><tr id="gr_svn14_593"

 onmouseover="gutterOver(593)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',593);">&nbsp;</span
></td><td id="593"><a href="#593">593</a></td></tr
><tr id="gr_svn14_594"

 onmouseover="gutterOver(594)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',594);">&nbsp;</span
></td><td id="594"><a href="#594">594</a></td></tr
><tr id="gr_svn14_595"

 onmouseover="gutterOver(595)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',595);">&nbsp;</span
></td><td id="595"><a href="#595">595</a></td></tr
><tr id="gr_svn14_596"

 onmouseover="gutterOver(596)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',596);">&nbsp;</span
></td><td id="596"><a href="#596">596</a></td></tr
><tr id="gr_svn14_597"

 onmouseover="gutterOver(597)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',597);">&nbsp;</span
></td><td id="597"><a href="#597">597</a></td></tr
><tr id="gr_svn14_598"

 onmouseover="gutterOver(598)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',598);">&nbsp;</span
></td><td id="598"><a href="#598">598</a></td></tr
><tr id="gr_svn14_599"

 onmouseover="gutterOver(599)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',599);">&nbsp;</span
></td><td id="599"><a href="#599">599</a></td></tr
><tr id="gr_svn14_600"

 onmouseover="gutterOver(600)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',600);">&nbsp;</span
></td><td id="600"><a href="#600">600</a></td></tr
><tr id="gr_svn14_601"

 onmouseover="gutterOver(601)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',601);">&nbsp;</span
></td><td id="601"><a href="#601">601</a></td></tr
><tr id="gr_svn14_602"

 onmouseover="gutterOver(602)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',602);">&nbsp;</span
></td><td id="602"><a href="#602">602</a></td></tr
><tr id="gr_svn14_603"

 onmouseover="gutterOver(603)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',603);">&nbsp;</span
></td><td id="603"><a href="#603">603</a></td></tr
><tr id="gr_svn14_604"

 onmouseover="gutterOver(604)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',604);">&nbsp;</span
></td><td id="604"><a href="#604">604</a></td></tr
><tr id="gr_svn14_605"

 onmouseover="gutterOver(605)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',605);">&nbsp;</span
></td><td id="605"><a href="#605">605</a></td></tr
><tr id="gr_svn14_606"

 onmouseover="gutterOver(606)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',606);">&nbsp;</span
></td><td id="606"><a href="#606">606</a></td></tr
><tr id="gr_svn14_607"

 onmouseover="gutterOver(607)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',607);">&nbsp;</span
></td><td id="607"><a href="#607">607</a></td></tr
><tr id="gr_svn14_608"

 onmouseover="gutterOver(608)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',608);">&nbsp;</span
></td><td id="608"><a href="#608">608</a></td></tr
><tr id="gr_svn14_609"

 onmouseover="gutterOver(609)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',609);">&nbsp;</span
></td><td id="609"><a href="#609">609</a></td></tr
><tr id="gr_svn14_610"

 onmouseover="gutterOver(610)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',610);">&nbsp;</span
></td><td id="610"><a href="#610">610</a></td></tr
><tr id="gr_svn14_611"

 onmouseover="gutterOver(611)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',611);">&nbsp;</span
></td><td id="611"><a href="#611">611</a></td></tr
><tr id="gr_svn14_612"

 onmouseover="gutterOver(612)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',612);">&nbsp;</span
></td><td id="612"><a href="#612">612</a></td></tr
><tr id="gr_svn14_613"

 onmouseover="gutterOver(613)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',613);">&nbsp;</span
></td><td id="613"><a href="#613">613</a></td></tr
><tr id="gr_svn14_614"

 onmouseover="gutterOver(614)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',614);">&nbsp;</span
></td><td id="614"><a href="#614">614</a></td></tr
><tr id="gr_svn14_615"

 onmouseover="gutterOver(615)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',615);">&nbsp;</span
></td><td id="615"><a href="#615">615</a></td></tr
><tr id="gr_svn14_616"

 onmouseover="gutterOver(616)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',616);">&nbsp;</span
></td><td id="616"><a href="#616">616</a></td></tr
><tr id="gr_svn14_617"

 onmouseover="gutterOver(617)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',617);">&nbsp;</span
></td><td id="617"><a href="#617">617</a></td></tr
><tr id="gr_svn14_618"

 onmouseover="gutterOver(618)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',618);">&nbsp;</span
></td><td id="618"><a href="#618">618</a></td></tr
><tr id="gr_svn14_619"

 onmouseover="gutterOver(619)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',619);">&nbsp;</span
></td><td id="619"><a href="#619">619</a></td></tr
><tr id="gr_svn14_620"

 onmouseover="gutterOver(620)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',620);">&nbsp;</span
></td><td id="620"><a href="#620">620</a></td></tr
><tr id="gr_svn14_621"

 onmouseover="gutterOver(621)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',621);">&nbsp;</span
></td><td id="621"><a href="#621">621</a></td></tr
><tr id="gr_svn14_622"

 onmouseover="gutterOver(622)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',622);">&nbsp;</span
></td><td id="622"><a href="#622">622</a></td></tr
><tr id="gr_svn14_623"

 onmouseover="gutterOver(623)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',623);">&nbsp;</span
></td><td id="623"><a href="#623">623</a></td></tr
><tr id="gr_svn14_624"

 onmouseover="gutterOver(624)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',624);">&nbsp;</span
></td><td id="624"><a href="#624">624</a></td></tr
><tr id="gr_svn14_625"

 onmouseover="gutterOver(625)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',625);">&nbsp;</span
></td><td id="625"><a href="#625">625</a></td></tr
><tr id="gr_svn14_626"

 onmouseover="gutterOver(626)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',626);">&nbsp;</span
></td><td id="626"><a href="#626">626</a></td></tr
><tr id="gr_svn14_627"

 onmouseover="gutterOver(627)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',627);">&nbsp;</span
></td><td id="627"><a href="#627">627</a></td></tr
><tr id="gr_svn14_628"

 onmouseover="gutterOver(628)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',628);">&nbsp;</span
></td><td id="628"><a href="#628">628</a></td></tr
><tr id="gr_svn14_629"

 onmouseover="gutterOver(629)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',629);">&nbsp;</span
></td><td id="629"><a href="#629">629</a></td></tr
><tr id="gr_svn14_630"

 onmouseover="gutterOver(630)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',630);">&nbsp;</span
></td><td id="630"><a href="#630">630</a></td></tr
><tr id="gr_svn14_631"

 onmouseover="gutterOver(631)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',631);">&nbsp;</span
></td><td id="631"><a href="#631">631</a></td></tr
><tr id="gr_svn14_632"

 onmouseover="gutterOver(632)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',632);">&nbsp;</span
></td><td id="632"><a href="#632">632</a></td></tr
><tr id="gr_svn14_633"

 onmouseover="gutterOver(633)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',633);">&nbsp;</span
></td><td id="633"><a href="#633">633</a></td></tr
><tr id="gr_svn14_634"

 onmouseover="gutterOver(634)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',634);">&nbsp;</span
></td><td id="634"><a href="#634">634</a></td></tr
><tr id="gr_svn14_635"

 onmouseover="gutterOver(635)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',635);">&nbsp;</span
></td><td id="635"><a href="#635">635</a></td></tr
><tr id="gr_svn14_636"

 onmouseover="gutterOver(636)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',636);">&nbsp;</span
></td><td id="636"><a href="#636">636</a></td></tr
><tr id="gr_svn14_637"

 onmouseover="gutterOver(637)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',637);">&nbsp;</span
></td><td id="637"><a href="#637">637</a></td></tr
><tr id="gr_svn14_638"

 onmouseover="gutterOver(638)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',638);">&nbsp;</span
></td><td id="638"><a href="#638">638</a></td></tr
><tr id="gr_svn14_639"

 onmouseover="gutterOver(639)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',639);">&nbsp;</span
></td><td id="639"><a href="#639">639</a></td></tr
><tr id="gr_svn14_640"

 onmouseover="gutterOver(640)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',640);">&nbsp;</span
></td><td id="640"><a href="#640">640</a></td></tr
><tr id="gr_svn14_641"

 onmouseover="gutterOver(641)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',641);">&nbsp;</span
></td><td id="641"><a href="#641">641</a></td></tr
><tr id="gr_svn14_642"

 onmouseover="gutterOver(642)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',642);">&nbsp;</span
></td><td id="642"><a href="#642">642</a></td></tr
><tr id="gr_svn14_643"

 onmouseover="gutterOver(643)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',643);">&nbsp;</span
></td><td id="643"><a href="#643">643</a></td></tr
><tr id="gr_svn14_644"

 onmouseover="gutterOver(644)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',644);">&nbsp;</span
></td><td id="644"><a href="#644">644</a></td></tr
><tr id="gr_svn14_645"

 onmouseover="gutterOver(645)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',645);">&nbsp;</span
></td><td id="645"><a href="#645">645</a></td></tr
><tr id="gr_svn14_646"

 onmouseover="gutterOver(646)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',646);">&nbsp;</span
></td><td id="646"><a href="#646">646</a></td></tr
><tr id="gr_svn14_647"

 onmouseover="gutterOver(647)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',647);">&nbsp;</span
></td><td id="647"><a href="#647">647</a></td></tr
><tr id="gr_svn14_648"

 onmouseover="gutterOver(648)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',648);">&nbsp;</span
></td><td id="648"><a href="#648">648</a></td></tr
><tr id="gr_svn14_649"

 onmouseover="gutterOver(649)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',649);">&nbsp;</span
></td><td id="649"><a href="#649">649</a></td></tr
><tr id="gr_svn14_650"

 onmouseover="gutterOver(650)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',650);">&nbsp;</span
></td><td id="650"><a href="#650">650</a></td></tr
><tr id="gr_svn14_651"

 onmouseover="gutterOver(651)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',651);">&nbsp;</span
></td><td id="651"><a href="#651">651</a></td></tr
><tr id="gr_svn14_652"

 onmouseover="gutterOver(652)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',652);">&nbsp;</span
></td><td id="652"><a href="#652">652</a></td></tr
><tr id="gr_svn14_653"

 onmouseover="gutterOver(653)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',653);">&nbsp;</span
></td><td id="653"><a href="#653">653</a></td></tr
><tr id="gr_svn14_654"

 onmouseover="gutterOver(654)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',654);">&nbsp;</span
></td><td id="654"><a href="#654">654</a></td></tr
><tr id="gr_svn14_655"

 onmouseover="gutterOver(655)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',655);">&nbsp;</span
></td><td id="655"><a href="#655">655</a></td></tr
><tr id="gr_svn14_656"

 onmouseover="gutterOver(656)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',656);">&nbsp;</span
></td><td id="656"><a href="#656">656</a></td></tr
><tr id="gr_svn14_657"

 onmouseover="gutterOver(657)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',657);">&nbsp;</span
></td><td id="657"><a href="#657">657</a></td></tr
><tr id="gr_svn14_658"

 onmouseover="gutterOver(658)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',658);">&nbsp;</span
></td><td id="658"><a href="#658">658</a></td></tr
><tr id="gr_svn14_659"

 onmouseover="gutterOver(659)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',659);">&nbsp;</span
></td><td id="659"><a href="#659">659</a></td></tr
><tr id="gr_svn14_660"

 onmouseover="gutterOver(660)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',660);">&nbsp;</span
></td><td id="660"><a href="#660">660</a></td></tr
><tr id="gr_svn14_661"

 onmouseover="gutterOver(661)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',661);">&nbsp;</span
></td><td id="661"><a href="#661">661</a></td></tr
><tr id="gr_svn14_662"

 onmouseover="gutterOver(662)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',662);">&nbsp;</span
></td><td id="662"><a href="#662">662</a></td></tr
><tr id="gr_svn14_663"

 onmouseover="gutterOver(663)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',663);">&nbsp;</span
></td><td id="663"><a href="#663">663</a></td></tr
><tr id="gr_svn14_664"

 onmouseover="gutterOver(664)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',664);">&nbsp;</span
></td><td id="664"><a href="#664">664</a></td></tr
><tr id="gr_svn14_665"

 onmouseover="gutterOver(665)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',665);">&nbsp;</span
></td><td id="665"><a href="#665">665</a></td></tr
><tr id="gr_svn14_666"

 onmouseover="gutterOver(666)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',666);">&nbsp;</span
></td><td id="666"><a href="#666">666</a></td></tr
><tr id="gr_svn14_667"

 onmouseover="gutterOver(667)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',667);">&nbsp;</span
></td><td id="667"><a href="#667">667</a></td></tr
><tr id="gr_svn14_668"

 onmouseover="gutterOver(668)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',668);">&nbsp;</span
></td><td id="668"><a href="#668">668</a></td></tr
><tr id="gr_svn14_669"

 onmouseover="gutterOver(669)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',669);">&nbsp;</span
></td><td id="669"><a href="#669">669</a></td></tr
><tr id="gr_svn14_670"

 onmouseover="gutterOver(670)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',670);">&nbsp;</span
></td><td id="670"><a href="#670">670</a></td></tr
><tr id="gr_svn14_671"

 onmouseover="gutterOver(671)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',671);">&nbsp;</span
></td><td id="671"><a href="#671">671</a></td></tr
><tr id="gr_svn14_672"

 onmouseover="gutterOver(672)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',672);">&nbsp;</span
></td><td id="672"><a href="#672">672</a></td></tr
><tr id="gr_svn14_673"

 onmouseover="gutterOver(673)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',673);">&nbsp;</span
></td><td id="673"><a href="#673">673</a></td></tr
><tr id="gr_svn14_674"

 onmouseover="gutterOver(674)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',674);">&nbsp;</span
></td><td id="674"><a href="#674">674</a></td></tr
><tr id="gr_svn14_675"

 onmouseover="gutterOver(675)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',675);">&nbsp;</span
></td><td id="675"><a href="#675">675</a></td></tr
><tr id="gr_svn14_676"

 onmouseover="gutterOver(676)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',676);">&nbsp;</span
></td><td id="676"><a href="#676">676</a></td></tr
><tr id="gr_svn14_677"

 onmouseover="gutterOver(677)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',677);">&nbsp;</span
></td><td id="677"><a href="#677">677</a></td></tr
><tr id="gr_svn14_678"

 onmouseover="gutterOver(678)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',678);">&nbsp;</span
></td><td id="678"><a href="#678">678</a></td></tr
><tr id="gr_svn14_679"

 onmouseover="gutterOver(679)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',679);">&nbsp;</span
></td><td id="679"><a href="#679">679</a></td></tr
><tr id="gr_svn14_680"

 onmouseover="gutterOver(680)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',680);">&nbsp;</span
></td><td id="680"><a href="#680">680</a></td></tr
><tr id="gr_svn14_681"

 onmouseover="gutterOver(681)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',681);">&nbsp;</span
></td><td id="681"><a href="#681">681</a></td></tr
><tr id="gr_svn14_682"

 onmouseover="gutterOver(682)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',682);">&nbsp;</span
></td><td id="682"><a href="#682">682</a></td></tr
><tr id="gr_svn14_683"

 onmouseover="gutterOver(683)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',683);">&nbsp;</span
></td><td id="683"><a href="#683">683</a></td></tr
><tr id="gr_svn14_684"

 onmouseover="gutterOver(684)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',684);">&nbsp;</span
></td><td id="684"><a href="#684">684</a></td></tr
><tr id="gr_svn14_685"

 onmouseover="gutterOver(685)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',685);">&nbsp;</span
></td><td id="685"><a href="#685">685</a></td></tr
><tr id="gr_svn14_686"

 onmouseover="gutterOver(686)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',686);">&nbsp;</span
></td><td id="686"><a href="#686">686</a></td></tr
><tr id="gr_svn14_687"

 onmouseover="gutterOver(687)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',687);">&nbsp;</span
></td><td id="687"><a href="#687">687</a></td></tr
><tr id="gr_svn14_688"

 onmouseover="gutterOver(688)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',688);">&nbsp;</span
></td><td id="688"><a href="#688">688</a></td></tr
><tr id="gr_svn14_689"

 onmouseover="gutterOver(689)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',689);">&nbsp;</span
></td><td id="689"><a href="#689">689</a></td></tr
><tr id="gr_svn14_690"

 onmouseover="gutterOver(690)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',690);">&nbsp;</span
></td><td id="690"><a href="#690">690</a></td></tr
><tr id="gr_svn14_691"

 onmouseover="gutterOver(691)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',691);">&nbsp;</span
></td><td id="691"><a href="#691">691</a></td></tr
><tr id="gr_svn14_692"

 onmouseover="gutterOver(692)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',692);">&nbsp;</span
></td><td id="692"><a href="#692">692</a></td></tr
><tr id="gr_svn14_693"

 onmouseover="gutterOver(693)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',693);">&nbsp;</span
></td><td id="693"><a href="#693">693</a></td></tr
><tr id="gr_svn14_694"

 onmouseover="gutterOver(694)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',694);">&nbsp;</span
></td><td id="694"><a href="#694">694</a></td></tr
><tr id="gr_svn14_695"

 onmouseover="gutterOver(695)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',695);">&nbsp;</span
></td><td id="695"><a href="#695">695</a></td></tr
><tr id="gr_svn14_696"

 onmouseover="gutterOver(696)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',696);">&nbsp;</span
></td><td id="696"><a href="#696">696</a></td></tr
><tr id="gr_svn14_697"

 onmouseover="gutterOver(697)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',697);">&nbsp;</span
></td><td id="697"><a href="#697">697</a></td></tr
><tr id="gr_svn14_698"

 onmouseover="gutterOver(698)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',698);">&nbsp;</span
></td><td id="698"><a href="#698">698</a></td></tr
><tr id="gr_svn14_699"

 onmouseover="gutterOver(699)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',699);">&nbsp;</span
></td><td id="699"><a href="#699">699</a></td></tr
><tr id="gr_svn14_700"

 onmouseover="gutterOver(700)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',700);">&nbsp;</span
></td><td id="700"><a href="#700">700</a></td></tr
><tr id="gr_svn14_701"

 onmouseover="gutterOver(701)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',701);">&nbsp;</span
></td><td id="701"><a href="#701">701</a></td></tr
><tr id="gr_svn14_702"

 onmouseover="gutterOver(702)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',702);">&nbsp;</span
></td><td id="702"><a href="#702">702</a></td></tr
><tr id="gr_svn14_703"

 onmouseover="gutterOver(703)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',703);">&nbsp;</span
></td><td id="703"><a href="#703">703</a></td></tr
><tr id="gr_svn14_704"

 onmouseover="gutterOver(704)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',704);">&nbsp;</span
></td><td id="704"><a href="#704">704</a></td></tr
><tr id="gr_svn14_705"

 onmouseover="gutterOver(705)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',705);">&nbsp;</span
></td><td id="705"><a href="#705">705</a></td></tr
><tr id="gr_svn14_706"

 onmouseover="gutterOver(706)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',706);">&nbsp;</span
></td><td id="706"><a href="#706">706</a></td></tr
><tr id="gr_svn14_707"

 onmouseover="gutterOver(707)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',707);">&nbsp;</span
></td><td id="707"><a href="#707">707</a></td></tr
><tr id="gr_svn14_708"

 onmouseover="gutterOver(708)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',708);">&nbsp;</span
></td><td id="708"><a href="#708">708</a></td></tr
><tr id="gr_svn14_709"

 onmouseover="gutterOver(709)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',709);">&nbsp;</span
></td><td id="709"><a href="#709">709</a></td></tr
><tr id="gr_svn14_710"

 onmouseover="gutterOver(710)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',710);">&nbsp;</span
></td><td id="710"><a href="#710">710</a></td></tr
><tr id="gr_svn14_711"

 onmouseover="gutterOver(711)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',711);">&nbsp;</span
></td><td id="711"><a href="#711">711</a></td></tr
><tr id="gr_svn14_712"

 onmouseover="gutterOver(712)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',712);">&nbsp;</span
></td><td id="712"><a href="#712">712</a></td></tr
><tr id="gr_svn14_713"

 onmouseover="gutterOver(713)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',713);">&nbsp;</span
></td><td id="713"><a href="#713">713</a></td></tr
><tr id="gr_svn14_714"

 onmouseover="gutterOver(714)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',714);">&nbsp;</span
></td><td id="714"><a href="#714">714</a></td></tr
><tr id="gr_svn14_715"

 onmouseover="gutterOver(715)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',715);">&nbsp;</span
></td><td id="715"><a href="#715">715</a></td></tr
><tr id="gr_svn14_716"

 onmouseover="gutterOver(716)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',716);">&nbsp;</span
></td><td id="716"><a href="#716">716</a></td></tr
><tr id="gr_svn14_717"

 onmouseover="gutterOver(717)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',717);">&nbsp;</span
></td><td id="717"><a href="#717">717</a></td></tr
><tr id="gr_svn14_718"

 onmouseover="gutterOver(718)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',718);">&nbsp;</span
></td><td id="718"><a href="#718">718</a></td></tr
><tr id="gr_svn14_719"

 onmouseover="gutterOver(719)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',719);">&nbsp;</span
></td><td id="719"><a href="#719">719</a></td></tr
><tr id="gr_svn14_720"

 onmouseover="gutterOver(720)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',720);">&nbsp;</span
></td><td id="720"><a href="#720">720</a></td></tr
><tr id="gr_svn14_721"

 onmouseover="gutterOver(721)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',721);">&nbsp;</span
></td><td id="721"><a href="#721">721</a></td></tr
><tr id="gr_svn14_722"

 onmouseover="gutterOver(722)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',722);">&nbsp;</span
></td><td id="722"><a href="#722">722</a></td></tr
><tr id="gr_svn14_723"

 onmouseover="gutterOver(723)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',723);">&nbsp;</span
></td><td id="723"><a href="#723">723</a></td></tr
><tr id="gr_svn14_724"

 onmouseover="gutterOver(724)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',724);">&nbsp;</span
></td><td id="724"><a href="#724">724</a></td></tr
><tr id="gr_svn14_725"

 onmouseover="gutterOver(725)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',725);">&nbsp;</span
></td><td id="725"><a href="#725">725</a></td></tr
><tr id="gr_svn14_726"

 onmouseover="gutterOver(726)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',726);">&nbsp;</span
></td><td id="726"><a href="#726">726</a></td></tr
><tr id="gr_svn14_727"

 onmouseover="gutterOver(727)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',727);">&nbsp;</span
></td><td id="727"><a href="#727">727</a></td></tr
><tr id="gr_svn14_728"

 onmouseover="gutterOver(728)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',728);">&nbsp;</span
></td><td id="728"><a href="#728">728</a></td></tr
><tr id="gr_svn14_729"

 onmouseover="gutterOver(729)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',729);">&nbsp;</span
></td><td id="729"><a href="#729">729</a></td></tr
><tr id="gr_svn14_730"

 onmouseover="gutterOver(730)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',730);">&nbsp;</span
></td><td id="730"><a href="#730">730</a></td></tr
><tr id="gr_svn14_731"

 onmouseover="gutterOver(731)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',731);">&nbsp;</span
></td><td id="731"><a href="#731">731</a></td></tr
><tr id="gr_svn14_732"

 onmouseover="gutterOver(732)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',732);">&nbsp;</span
></td><td id="732"><a href="#732">732</a></td></tr
><tr id="gr_svn14_733"

 onmouseover="gutterOver(733)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',733);">&nbsp;</span
></td><td id="733"><a href="#733">733</a></td></tr
><tr id="gr_svn14_734"

 onmouseover="gutterOver(734)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',734);">&nbsp;</span
></td><td id="734"><a href="#734">734</a></td></tr
><tr id="gr_svn14_735"

 onmouseover="gutterOver(735)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',735);">&nbsp;</span
></td><td id="735"><a href="#735">735</a></td></tr
><tr id="gr_svn14_736"

 onmouseover="gutterOver(736)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',736);">&nbsp;</span
></td><td id="736"><a href="#736">736</a></td></tr
><tr id="gr_svn14_737"

 onmouseover="gutterOver(737)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',737);">&nbsp;</span
></td><td id="737"><a href="#737">737</a></td></tr
><tr id="gr_svn14_738"

 onmouseover="gutterOver(738)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',738);">&nbsp;</span
></td><td id="738"><a href="#738">738</a></td></tr
><tr id="gr_svn14_739"

 onmouseover="gutterOver(739)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',739);">&nbsp;</span
></td><td id="739"><a href="#739">739</a></td></tr
><tr id="gr_svn14_740"

 onmouseover="gutterOver(740)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',740);">&nbsp;</span
></td><td id="740"><a href="#740">740</a></td></tr
><tr id="gr_svn14_741"

 onmouseover="gutterOver(741)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',741);">&nbsp;</span
></td><td id="741"><a href="#741">741</a></td></tr
><tr id="gr_svn14_742"

 onmouseover="gutterOver(742)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',742);">&nbsp;</span
></td><td id="742"><a href="#742">742</a></td></tr
><tr id="gr_svn14_743"

 onmouseover="gutterOver(743)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',743);">&nbsp;</span
></td><td id="743"><a href="#743">743</a></td></tr
><tr id="gr_svn14_744"

 onmouseover="gutterOver(744)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',744);">&nbsp;</span
></td><td id="744"><a href="#744">744</a></td></tr
><tr id="gr_svn14_745"

 onmouseover="gutterOver(745)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',745);">&nbsp;</span
></td><td id="745"><a href="#745">745</a></td></tr
><tr id="gr_svn14_746"

 onmouseover="gutterOver(746)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',746);">&nbsp;</span
></td><td id="746"><a href="#746">746</a></td></tr
><tr id="gr_svn14_747"

 onmouseover="gutterOver(747)"

><td><span title="Add comment" onclick="codereviews.startEdit('svn14',747);">&nbsp;</span
></td><td id="747"><a href="#747">747</a></td></tr
></table></pre>
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
</td>
<td id="lines">
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
<pre class="prettyprint lang-java"><table id="src_table_0"><tr
id=sl_svn14_1

 onmouseover="gutterOver(1)"

><td class="source">/**<br></td></tr
><tr
id=sl_svn14_2

 onmouseover="gutterOver(2)"

><td class="source"> * @author Fami<br></td></tr
><tr
id=sl_svn14_3

 onmouseover="gutterOver(3)"

><td class="source"> * @version 1.0.0<br></td></tr
><tr
id=sl_svn14_4

 onmouseover="gutterOver(4)"

><td class="source"> * Project: gravity-jio version 1.0.0<br></td></tr
><tr
id=sl_svn14_5

 onmouseover="gutterOver(5)"

><td class="source"> * Created on May 1, 2013<br></td></tr
><tr
id=sl_svn14_6

 onmouseover="gutterOver(6)"

><td class="source"> * <br></td></tr
><tr
id=sl_svn14_7

 onmouseover="gutterOver(7)"

><td class="source"> * Copyright 2013 gravity-jio v1.0 Developers<br></td></tr
><tr
id=sl_svn14_8

 onmouseover="gutterOver(8)"

><td class="source"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);<br></td></tr
><tr
id=sl_svn14_9

 onmouseover="gutterOver(9)"

><td class="source"> * you may not use this file except in compliance with the License.<br></td></tr
><tr
id=sl_svn14_10

 onmouseover="gutterOver(10)"

><td class="source"> * You may obtain a copy of the License at<br></td></tr
><tr
id=sl_svn14_11

 onmouseover="gutterOver(11)"

><td class="source"> * http://www.apache.org/licenses/LICENSE-2.0<br></td></tr
><tr
id=sl_svn14_12

 onmouseover="gutterOver(12)"

><td class="source"> * Unless required by applicable law or agreed to in writing, software<br></td></tr
><tr
id=sl_svn14_13

 onmouseover="gutterOver(13)"

><td class="source"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,<br></td></tr
><tr
id=sl_svn14_14

 onmouseover="gutterOver(14)"

><td class="source"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br></td></tr
><tr
id=sl_svn14_15

 onmouseover="gutterOver(15)"

><td class="source"> * See the License for the specific language governing permissions and<br></td></tr
><tr
id=sl_svn14_16

 onmouseover="gutterOver(16)"

><td class="source"> * limitations under the License.<br></td></tr
><tr
id=sl_svn14_17

 onmouseover="gutterOver(17)"

><td class="source"> */<br></td></tr
><tr
id=sl_svn14_18

 onmouseover="gutterOver(18)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_19

 onmouseover="gutterOver(19)"

><td class="source">package gravity;<br></td></tr
><tr
id=sl_svn14_20

 onmouseover="gutterOver(20)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_21

 onmouseover="gutterOver(21)"

><td class="source">import java.io.BufferedReader;<br></td></tr
><tr
id=sl_svn14_22

 onmouseover="gutterOver(22)"

><td class="source">import java.io.File;<br></td></tr
><tr
id=sl_svn14_23

 onmouseover="gutterOver(23)"

><td class="source">import java.io.FileInputStream;<br></td></tr
><tr
id=sl_svn14_24

 onmouseover="gutterOver(24)"

><td class="source">import java.io.FileOutputStream;<br></td></tr
><tr
id=sl_svn14_25

 onmouseover="gutterOver(25)"

><td class="source">import java.io.IOException;<br></td></tr
><tr
id=sl_svn14_26

 onmouseover="gutterOver(26)"

><td class="source">import java.io.InputStream;<br></td></tr
><tr
id=sl_svn14_27

 onmouseover="gutterOver(27)"

><td class="source">import java.io.InputStreamReader;<br></td></tr
><tr
id=sl_svn14_28

 onmouseover="gutterOver(28)"

><td class="source">import java.io.OutputStream;<br></td></tr
><tr
id=sl_svn14_29

 onmouseover="gutterOver(29)"

><td class="source">import java.text.DateFormat;<br></td></tr
><tr
id=sl_svn14_30

 onmouseover="gutterOver(30)"

><td class="source">import java.text.SimpleDateFormat;<br></td></tr
><tr
id=sl_svn14_31

 onmouseover="gutterOver(31)"

><td class="source">import java.util.Date;<br></td></tr
><tr
id=sl_svn14_32

 onmouseover="gutterOver(32)"

><td class="source">import java.util.Enumeration;<br></td></tr
><tr
id=sl_svn14_33

 onmouseover="gutterOver(33)"

><td class="source">import java.util.zip.ZipEntry;<br></td></tr
><tr
id=sl_svn14_34

 onmouseover="gutterOver(34)"

><td class="source">import java.util.zip.ZipFile;<br></td></tr
><tr
id=sl_svn14_35

 onmouseover="gutterOver(35)"

><td class="source">import java.util.zip.ZipOutputStream;<br></td></tr
><tr
id=sl_svn14_36

 onmouseover="gutterOver(36)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_37

 onmouseover="gutterOver(37)"

><td class="source">public class jioLib {<br></td></tr
><tr
id=sl_svn14_38

 onmouseover="gutterOver(38)"

><td class="source">	<br></td></tr
><tr
id=sl_svn14_39

 onmouseover="gutterOver(39)"

><td class="source">	public static class function{<br></td></tr
><tr
id=sl_svn14_40

 onmouseover="gutterOver(40)"

><td class="source">	<br></td></tr
><tr
id=sl_svn14_41

 onmouseover="gutterOver(41)"

><td class="source">    /**<br></td></tr
><tr
id=sl_svn14_42

 onmouseover="gutterOver(42)"

><td class="source">     * Function name: dir<br></td></tr
><tr
id=sl_svn14_43

 onmouseover="gutterOver(43)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_44

 onmouseover="gutterOver(44)"

><td class="source">     * Use of function: For displaying/assigning path to the current directory path<br></td></tr
><tr
id=sl_svn14_45

 onmouseover="gutterOver(45)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_46

 onmouseover="gutterOver(46)"

><td class="source">     * @param currentPath String for string current directory path<br></td></tr
><tr
id=sl_svn14_47

 onmouseover="gutterOver(47)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_48

 onmouseover="gutterOver(48)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_49

 onmouseover="gutterOver(49)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_50

 onmouseover="gutterOver(50)"

><td class="source">	 * String localPath = function.dir();<br></td></tr
><tr
id=sl_svn14_51

 onmouseover="gutterOver(51)"

><td class="source">     */<br></td></tr
><tr
id=sl_svn14_52

 onmouseover="gutterOver(52)"

><td class="source">	public static String currentPath;		<br></td></tr
><tr
id=sl_svn14_53

 onmouseover="gutterOver(53)"

><td class="source">	public static String dir() throws IOException{<br></td></tr
><tr
id=sl_svn14_54

 onmouseover="gutterOver(54)"

><td class="source">		currentPath=new java.io.File( &quot;.&quot; ).getCanonicalPath()+&quot;/&quot;;<br></td></tr
><tr
id=sl_svn14_55

 onmouseover="gutterOver(55)"

><td class="source">		return currentPath;<br></td></tr
><tr
id=sl_svn14_56

 onmouseover="gutterOver(56)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_57

 onmouseover="gutterOver(57)"

><td class="source">    /**<br></td></tr
><tr
id=sl_svn14_58

 onmouseover="gutterOver(58)"

><td class="source">     * Function name: timestamp<br></td></tr
><tr
id=sl_svn14_59

 onmouseover="gutterOver(59)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_60

 onmouseover="gutterOver(60)"

><td class="source">     * Use of function: capture current server time and date in format: yymmdd_hhmm<br></td></tr
><tr
id=sl_svn14_61

 onmouseover="gutterOver(61)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_62

 onmouseover="gutterOver(62)"

><td class="source">     * @param timestamp String for string current directory path<br></td></tr
><tr
id=sl_svn14_63

 onmouseover="gutterOver(63)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_64

 onmouseover="gutterOver(64)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_65

 onmouseover="gutterOver(65)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_66

 onmouseover="gutterOver(66)"

><td class="source">	 * String timestamp = function.timestamp();<br></td></tr
><tr
id=sl_svn14_67

 onmouseover="gutterOver(67)"

><td class="source">     */<br></td></tr
><tr
id=sl_svn14_68

 onmouseover="gutterOver(68)"

><td class="source">	public static String timestamp;<br></td></tr
><tr
id=sl_svn14_69

 onmouseover="gutterOver(69)"

><td class="source">	public static String timestamp() throws IOException{<br></td></tr
><tr
id=sl_svn14_70

 onmouseover="gutterOver(70)"

><td class="source">		DateFormat dateFormat = new SimpleDateFormat(&quot;yyyyMMdd_HHmm&quot;);<br></td></tr
><tr
id=sl_svn14_71

 onmouseover="gutterOver(71)"

><td class="source">		Date date = new Date();<br></td></tr
><tr
id=sl_svn14_72

 onmouseover="gutterOver(72)"

><td class="source">		String timestamp=dateFormat.format(date);<br></td></tr
><tr
id=sl_svn14_73

 onmouseover="gutterOver(73)"

><td class="source">		return timestamp;<br></td></tr
><tr
id=sl_svn14_74

 onmouseover="gutterOver(74)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_75

 onmouseover="gutterOver(75)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_76

 onmouseover="gutterOver(76)"

><td class="source">	 * Function name: fileCreate<br></td></tr
><tr
id=sl_svn14_77

 onmouseover="gutterOver(77)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_78

 onmouseover="gutterOver(78)"

><td class="source">	 * Use of function: Creating and output file<br></td></tr
><tr
id=sl_svn14_79

 onmouseover="gutterOver(79)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_80

 onmouseover="gutterOver(80)"

><td class="source">	 * @param fileName Name of the file name to be create <br></td></tr
><tr
id=sl_svn14_81

 onmouseover="gutterOver(81)"

><td class="source">	 * @param fileExt Type of file extension<br></td></tr
><tr
id=sl_svn14_82

 onmouseover="gutterOver(82)"

><td class="source">	 * @param Destination Directory path to store the created file<br></td></tr
><tr
id=sl_svn14_83

 onmouseover="gutterOver(83)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_84

 onmouseover="gutterOver(84)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_85

 onmouseover="gutterOver(85)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_86

 onmouseover="gutterOver(86)"

><td class="source">	 * function.fileCreate( &quot;test&quot;, &quot;txt&quot;, &quot;C:\&quot;);<br></td></tr
><tr
id=sl_svn14_87

 onmouseover="gutterOver(87)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_88

 onmouseover="gutterOver(88)"

><td class="source">	public static void fileCreate(String fileName, String fileExt, String Destination){<br></td></tr
><tr
id=sl_svn14_89

 onmouseover="gutterOver(89)"

><td class="source">		<br></td></tr
><tr
id=sl_svn14_90

 onmouseover="gutterOver(90)"

><td class="source">		try {<br></td></tr
><tr
id=sl_svn14_91

 onmouseover="gutterOver(91)"

><td class="source">			//PrintWriter render = new PrintWriter(new FileWriter(Destination+&quot;/&quot;+fileName+&quot;.&quot;+fileExt));	<br></td></tr
><tr
id=sl_svn14_92

 onmouseover="gutterOver(92)"

><td class="source">			//FileWriter create = new FileWriter(Destination+fileName+&quot;.&quot;+fileExt);	<br></td></tr
><tr
id=sl_svn14_93

 onmouseover="gutterOver(93)"

><td class="source">			File create = new File(Destination+fileName+&quot;.&quot;+fileExt);<br></td></tr
><tr
id=sl_svn14_94

 onmouseover="gutterOver(94)"

><td class="source">			create.createNewFile();<br></td></tr
><tr
id=sl_svn14_95

 onmouseover="gutterOver(95)"

><td class="source">		} <br></td></tr
><tr
id=sl_svn14_96

 onmouseover="gutterOver(96)"

><td class="source">		catch (IOException iofail) {<br></td></tr
><tr
id=sl_svn14_97

 onmouseover="gutterOver(97)"

><td class="source">			System.out.println(&quot;File creation fail, please check your fileCreate parameters value&quot;);<br></td></tr
><tr
id=sl_svn14_98

 onmouseover="gutterOver(98)"

><td class="source">			iofail.printStackTrace();<br></td></tr
><tr
id=sl_svn14_99

 onmouseover="gutterOver(99)"

><td class="source">		}		<br></td></tr
><tr
id=sl_svn14_100

 onmouseover="gutterOver(100)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_101

 onmouseover="gutterOver(101)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_102

 onmouseover="gutterOver(102)"

><td class="source">	 * Function name: fileDel<br></td></tr
><tr
id=sl_svn14_103

 onmouseover="gutterOver(103)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_104

 onmouseover="gutterOver(104)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_105

 onmouseover="gutterOver(105)"

><td class="source">	 * Use of function: Deleting the designated file<br></td></tr
><tr
id=sl_svn14_106

 onmouseover="gutterOver(106)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_107

 onmouseover="gutterOver(107)"

><td class="source">	 * @param fileName Name of the file name to delete<br></td></tr
><tr
id=sl_svn14_108

 onmouseover="gutterOver(108)"

><td class="source">	 * @param fileExt Type of file extension<br></td></tr
><tr
id=sl_svn14_109

 onmouseover="gutterOver(109)"

><td class="source">	 * @param Destination Directory path of the file<br></td></tr
><tr
id=sl_svn14_110

 onmouseover="gutterOver(110)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_111

 onmouseover="gutterOver(111)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_112

 onmouseover="gutterOver(112)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_113

 onmouseover="gutterOver(113)"

><td class="source">	 * function.fileDel(&quot;test&quot;, &quot;txt&quot;, &quot;C:\&quot;);<br></td></tr
><tr
id=sl_svn14_114

 onmouseover="gutterOver(114)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_115

 onmouseover="gutterOver(115)"

><td class="source">	public static void fileDel(String fileName, String fileExt, String Destination){<br></td></tr
><tr
id=sl_svn14_116

 onmouseover="gutterOver(116)"

><td class="source">		<br></td></tr
><tr
id=sl_svn14_117

 onmouseover="gutterOver(117)"

><td class="source">		try{<br></td></tr
><tr
id=sl_svn14_118

 onmouseover="gutterOver(118)"

><td class="source">			 <br></td></tr
><tr
id=sl_svn14_119

 onmouseover="gutterOver(119)"

><td class="source">    		File fileDelete = new File(Destination+fileName+&quot;.&quot;+fileExt);<br></td></tr
><tr
id=sl_svn14_120

 onmouseover="gutterOver(120)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_121

 onmouseover="gutterOver(121)"

><td class="source">    		if(fileDelete.delete()){<br></td></tr
><tr
id=sl_svn14_122

 onmouseover="gutterOver(122)"

><td class="source">    			System.out.println(fileDelete.getName() + &quot; is deleted!&quot;);<br></td></tr
><tr
id=sl_svn14_123

 onmouseover="gutterOver(123)"

><td class="source">    		}else{<br></td></tr
><tr
id=sl_svn14_124

 onmouseover="gutterOver(124)"

><td class="source">    			System.out.println(&quot;Delete operation is failed.&quot;);<br></td></tr
><tr
id=sl_svn14_125

 onmouseover="gutterOver(125)"

><td class="source">    		}<br></td></tr
><tr
id=sl_svn14_126

 onmouseover="gutterOver(126)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_127

 onmouseover="gutterOver(127)"

><td class="source">    	}catch(Exception e){<br></td></tr
><tr
id=sl_svn14_128

 onmouseover="gutterOver(128)"

><td class="source">    		System.out.println(&quot;File not found, please check your input parameters&quot;);<br></td></tr
><tr
id=sl_svn14_129

 onmouseover="gutterOver(129)"

><td class="source">    		e.printStackTrace();<br></td></tr
><tr
id=sl_svn14_130

 onmouseover="gutterOver(130)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_131

 onmouseover="gutterOver(131)"

><td class="source">    	}		<br></td></tr
><tr
id=sl_svn14_132

 onmouseover="gutterOver(132)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_133

 onmouseover="gutterOver(133)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_134

 onmouseover="gutterOver(134)"

><td class="source">	 * Function name: fileCheck<br></td></tr
><tr
id=sl_svn14_135

 onmouseover="gutterOver(135)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_136

 onmouseover="gutterOver(136)"

><td class="source">	 * Checking the file existence<br></td></tr
><tr
id=sl_svn14_137

 onmouseover="gutterOver(137)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_138

 onmouseover="gutterOver(138)"

><td class="source">	 * @param fileName Name of file to be check<br></td></tr
><tr
id=sl_svn14_139

 onmouseover="gutterOver(139)"

><td class="source">	 * @param fileExt Type of file extension<br></td></tr
><tr
id=sl_svn14_140

 onmouseover="gutterOver(140)"

><td class="source">	 * @param Destination Directory Path of the file<br></td></tr
><tr
id=sl_svn14_141

 onmouseover="gutterOver(141)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_142

 onmouseover="gutterOver(142)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_143

 onmouseover="gutterOver(143)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_144

 onmouseover="gutterOver(144)"

><td class="source">	 * function.fileCheck( &quot;test&quot;, &quot;txt&quot;, &quot;C:\&quot;);<br></td></tr
><tr
id=sl_svn14_145

 onmouseover="gutterOver(145)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_146

 onmouseover="gutterOver(146)"

><td class="source">	public static void fileCheck(String fileName, String fileExt, String Destination){<br></td></tr
><tr
id=sl_svn14_147

 onmouseover="gutterOver(147)"

><td class="source">		<br></td></tr
><tr
id=sl_svn14_148

 onmouseover="gutterOver(148)"

><td class="source">		try{<br></td></tr
><tr
id=sl_svn14_149

 onmouseover="gutterOver(149)"

><td class="source">			 <br></td></tr
><tr
id=sl_svn14_150

 onmouseover="gutterOver(150)"

><td class="source">    		File file = new File(Destination+fileName+&quot;.&quot;+fileExt);<br></td></tr
><tr
id=sl_svn14_151

 onmouseover="gutterOver(151)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_152

 onmouseover="gutterOver(152)"

><td class="source">    		if(file.exists()){<br></td></tr
><tr
id=sl_svn14_153

 onmouseover="gutterOver(153)"

><td class="source">    			System.out.println(&quot;File name: &quot;+file.getName() + &quot; existed&quot;);<br></td></tr
><tr
id=sl_svn14_154

 onmouseover="gutterOver(154)"

><td class="source">    		}else{<br></td></tr
><tr
id=sl_svn14_155

 onmouseover="gutterOver(155)"

><td class="source">    			System.out.println(&quot;File name: &quot;+file.getName() + &quot; not found&quot;);<br></td></tr
><tr
id=sl_svn14_156

 onmouseover="gutterOver(156)"

><td class="source">    		}<br></td></tr
><tr
id=sl_svn14_157

 onmouseover="gutterOver(157)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_158

 onmouseover="gutterOver(158)"

><td class="source">    	}catch(Exception e){<br></td></tr
><tr
id=sl_svn14_159

 onmouseover="gutterOver(159)"

><td class="source">    		System.out.println(&quot;Invalid input parameters, please check your input parameters&quot;);<br></td></tr
><tr
id=sl_svn14_160

 onmouseover="gutterOver(160)"

><td class="source">    		e.printStackTrace();<br></td></tr
><tr
id=sl_svn14_161

 onmouseover="gutterOver(161)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_162

 onmouseover="gutterOver(162)"

><td class="source">    	}	<br></td></tr
><tr
id=sl_svn14_163

 onmouseover="gutterOver(163)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_164

 onmouseover="gutterOver(164)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_165

 onmouseover="gutterOver(165)"

><td class="source">	 * Function name: fileChangExtOne<br></td></tr
><tr
id=sl_svn14_166

 onmouseover="gutterOver(166)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_167

 onmouseover="gutterOver(167)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_168

 onmouseover="gutterOver(168)"

><td class="source">	 * Change the extension of selected file<br></td></tr
><tr
id=sl_svn14_169

 onmouseover="gutterOver(169)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_170

 onmouseover="gutterOver(170)"

><td class="source">	 * @param fileName Name of file to be convert<br></td></tr
><tr
id=sl_svn14_171

 onmouseover="gutterOver(171)"

><td class="source">	 * @param fileExt Type of file extension<br></td></tr
><tr
id=sl_svn14_172

 onmouseover="gutterOver(172)"

><td class="source">     * @param NewfileExt extension for conversion<br></td></tr
><tr
id=sl_svn14_173

 onmouseover="gutterOver(173)"

><td class="source">	 * @param Destination Directory Path of the file<br></td></tr
><tr
id=sl_svn14_174

 onmouseover="gutterOver(174)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_175

 onmouseover="gutterOver(175)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_176

 onmouseover="gutterOver(176)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_177

 onmouseover="gutterOver(177)"

><td class="source">	 * function.fileChangExtOne(&quot;test&quot;, &quot;txt&quot;, &quot;dat&quot;, &quot;C:\&quot;);<br></td></tr
><tr
id=sl_svn14_178

 onmouseover="gutterOver(178)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_179

 onmouseover="gutterOver(179)"

><td class="source">	public static void fileChangExtOne(String fileName, String fileExt, String NewfileExt, String Destination){<br></td></tr
><tr
id=sl_svn14_180

 onmouseover="gutterOver(180)"

><td class="source">		try{<br></td></tr
><tr
id=sl_svn14_181

 onmouseover="gutterOver(181)"

><td class="source">    		File fileToRename = new File(Destination+fileName+&quot;.&quot;+fileExt);<br></td></tr
><tr
id=sl_svn14_182

 onmouseover="gutterOver(182)"

><td class="source">    		File NewfileToRename = new File(Destination+fileName+&quot;.&quot;+NewfileExt);<br></td></tr
><tr
id=sl_svn14_183

 onmouseover="gutterOver(183)"

><td class="source">    		boolean success = fileToRename.renameTo(NewfileToRename);<br></td></tr
><tr
id=sl_svn14_184

 onmouseover="gutterOver(184)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_185

 onmouseover="gutterOver(185)"

><td class="source">    		if(success){<br></td></tr
><tr
id=sl_svn14_186

 onmouseover="gutterOver(186)"

><td class="source">    			System.out.println(&quot;Successfully converting file to: &quot;+NewfileToRename);<br></td></tr
><tr
id=sl_svn14_187

 onmouseover="gutterOver(187)"

><td class="source">    		}else{<br></td></tr
><tr
id=sl_svn14_188

 onmouseover="gutterOver(188)"

><td class="source">    			System.out.println(&quot;Fail converting file: &quot;+fileToRename);<br></td></tr
><tr
id=sl_svn14_189

 onmouseover="gutterOver(189)"

><td class="source">    		}<br></td></tr
><tr
id=sl_svn14_190

 onmouseover="gutterOver(190)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_191

 onmouseover="gutterOver(191)"

><td class="source">    	}catch(Exception e){<br></td></tr
><tr
id=sl_svn14_192

 onmouseover="gutterOver(192)"

><td class="source">    		System.out.println(&quot;Invalid input parameters, please check your input parameters&quot;);<br></td></tr
><tr
id=sl_svn14_193

 onmouseover="gutterOver(193)"

><td class="source">    		e.printStackTrace();<br></td></tr
><tr
id=sl_svn14_194

 onmouseover="gutterOver(194)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_195

 onmouseover="gutterOver(195)"

><td class="source">    	}		<br></td></tr
><tr
id=sl_svn14_196

 onmouseover="gutterOver(196)"

><td class="source">    	return ;<br></td></tr
><tr
id=sl_svn14_197

 onmouseover="gutterOver(197)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_198

 onmouseover="gutterOver(198)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_199

 onmouseover="gutterOver(199)"

><td class="source">	 * Function name: fileChangExtMulti<br></td></tr
><tr
id=sl_svn14_200

 onmouseover="gutterOver(200)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_201

 onmouseover="gutterOver(201)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_202

 onmouseover="gutterOver(202)"

><td class="source">	 * Change the extension of multiple file<br></td></tr
><tr
id=sl_svn14_203

 onmouseover="gutterOver(203)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_204

 onmouseover="gutterOver(204)"

><td class="source">	 * @param fileExt Type of file extension<br></td></tr
><tr
id=sl_svn14_205

 onmouseover="gutterOver(205)"

><td class="source">     * @param NewfileExt extension for conversion<br></td></tr
><tr
id=sl_svn14_206

 onmouseover="gutterOver(206)"

><td class="source">	 * @param Destination Directory Path of the file<br></td></tr
><tr
id=sl_svn14_207

 onmouseover="gutterOver(207)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_208

 onmouseover="gutterOver(208)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_209

 onmouseover="gutterOver(209)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_210

 onmouseover="gutterOver(210)"

><td class="source">	 * function.fileChangExtMulti(&quot;txt&quot;, &quot;dat&quot;, &quot;C:\&quot;);<br></td></tr
><tr
id=sl_svn14_211

 onmouseover="gutterOver(211)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_212

 onmouseover="gutterOver(212)"

><td class="source">	public static void fileChangExtMulti(String fileExt, String NewfileExt, String Destination){<br></td></tr
><tr
id=sl_svn14_213

 onmouseover="gutterOver(213)"

><td class="source">		try{<br></td></tr
><tr
id=sl_svn14_214

 onmouseover="gutterOver(214)"

><td class="source">    		File folder = new File(Destination);<br></td></tr
><tr
id=sl_svn14_215

 onmouseover="gutterOver(215)"

><td class="source">    		File [] folderArray = folder.listFiles();<br></td></tr
><tr
id=sl_svn14_216

 onmouseover="gutterOver(216)"

><td class="source">    		for ( int x=0; x&lt;folderArray.length; x++){<br></td></tr
><tr
id=sl_svn14_217

 onmouseover="gutterOver(217)"

><td class="source">    			<br></td></tr
><tr
id=sl_svn14_218

 onmouseover="gutterOver(218)"

><td class="source">    			//Set filter<br></td></tr
><tr
id=sl_svn14_219

 onmouseover="gutterOver(219)"

><td class="source">    			String filterFile = folderArray[x].getName();<br></td></tr
><tr
id=sl_svn14_220

 onmouseover="gutterOver(220)"

><td class="source">    			int index = filterFile.lastIndexOf(&quot;.&quot;);<br></td></tr
><tr
id=sl_svn14_221

 onmouseover="gutterOver(221)"

><td class="source">    			<br></td></tr
><tr
id=sl_svn14_222

 onmouseover="gutterOver(222)"

><td class="source">    			if(folderArray[x].getName().endsWith(fileExt)==true){<br></td></tr
><tr
id=sl_svn14_223

 onmouseover="gutterOver(223)"

><td class="source">    				if (index&gt;0&amp;&amp; index &lt;= folderArray[x].getName().length() - 2 ) {<br></td></tr
><tr
id=sl_svn14_224

 onmouseover="gutterOver(224)"

><td class="source">    					File fileToRename = new File(Destination+folderArray[x].getName().substring(0, index)+&quot;.&quot;+fileExt);<br></td></tr
><tr
id=sl_svn14_225

 onmouseover="gutterOver(225)"

><td class="source">    		    		File NewfileToRename = new File(Destination+folderArray[x].getName().substring(0, index)+&quot;.&quot;+NewfileExt);<br></td></tr
><tr
id=sl_svn14_226

 onmouseover="gutterOver(226)"

><td class="source">    		    		fileToRename.renameTo(NewfileToRename);<br></td></tr
><tr
id=sl_svn14_227

 onmouseover="gutterOver(227)"

><td class="source">    		    		System.out.println(folderArray[x].getName().substring(0, index)+&quot; : Converted from &quot;+&#39;&quot;&#39;+&quot;.&quot;+fileExt+&#39;&quot;&#39;+ &quot; to &quot;+&#39;&quot;&#39;+&quot;.&quot;+NewfileExt+&#39;&quot;&#39;);<br></td></tr
><tr
id=sl_svn14_228

 onmouseover="gutterOver(228)"

><td class="source">    				}<br></td></tr
><tr
id=sl_svn14_229

 onmouseover="gutterOver(229)"

><td class="source">    				<br></td></tr
><tr
id=sl_svn14_230

 onmouseover="gutterOver(230)"

><td class="source">    				}else{<br></td></tr
><tr
id=sl_svn14_231

 onmouseover="gutterOver(231)"

><td class="source">    				System.out.println(&quot;No file with extension &quot;+fileExt+&quot; found&quot;);<br></td></tr
><tr
id=sl_svn14_232

 onmouseover="gutterOver(232)"

><td class="source">    			}<br></td></tr
><tr
id=sl_svn14_233

 onmouseover="gutterOver(233)"

><td class="source">    		}<br></td></tr
><tr
id=sl_svn14_234

 onmouseover="gutterOver(234)"

><td class="source">    	}catch(Exception e){<br></td></tr
><tr
id=sl_svn14_235

 onmouseover="gutterOver(235)"

><td class="source">    		System.out.println(&quot;Invalid input parameters, please check your input parameters&quot;);<br></td></tr
><tr
id=sl_svn14_236

 onmouseover="gutterOver(236)"

><td class="source">    		e.printStackTrace();<br></td></tr
><tr
id=sl_svn14_237

 onmouseover="gutterOver(237)"

><td class="source"> <br></td></tr
><tr
id=sl_svn14_238

 onmouseover="gutterOver(238)"

><td class="source">    	}	<br></td></tr
><tr
id=sl_svn14_239

 onmouseover="gutterOver(239)"

><td class="source">        System.out.println(&quot;Conversion process completed.&quot;);<br></td></tr
><tr
id=sl_svn14_240

 onmouseover="gutterOver(240)"

><td class="source">    	return ;<br></td></tr
><tr
id=sl_svn14_241

 onmouseover="gutterOver(241)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_242

 onmouseover="gutterOver(242)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_243

 onmouseover="gutterOver(243)"

><td class="source">	 * Function name: copyFile<br></td></tr
><tr
id=sl_svn14_244

 onmouseover="gutterOver(244)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_245

 onmouseover="gutterOver(245)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_246

 onmouseover="gutterOver(246)"

><td class="source">	 * Copy the targeted file to a designated directories.<br></td></tr
><tr
id=sl_svn14_247

 onmouseover="gutterOver(247)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_248

 onmouseover="gutterOver(248)"

><td class="source">	 * @param fileName Name of file.<br></td></tr
><tr
id=sl_svn14_249

 onmouseover="gutterOver(249)"

><td class="source">	 * @param fileExt Type of the file extension.<br></td></tr
><tr
id=sl_svn14_250

 onmouseover="gutterOver(250)"

><td class="source">     * @param Path Directory path for the fileName.<br></td></tr
><tr
id=sl_svn14_251

 onmouseover="gutterOver(251)"

><td class="source">	 * @param Destination Directory Path for the copy file.<br></td></tr
><tr
id=sl_svn14_252

 onmouseover="gutterOver(252)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_253

 onmouseover="gutterOver(253)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_254

 onmouseover="gutterOver(254)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_255

 onmouseover="gutterOver(255)"

><td class="source">	 * function.copyFile(&quot;test&quot;, &quot;txt&quot;, &quot;C:\&quot;, &quot;C:\test\&quot;);<br></td></tr
><tr
id=sl_svn14_256

 onmouseover="gutterOver(256)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_257

 onmouseover="gutterOver(257)"

><td class="source">	public static void copyFile(String fileName, String fileExt, String Path, String Destination){<br></td></tr
><tr
id=sl_svn14_258

 onmouseover="gutterOver(258)"

><td class="source">		try{<br></td></tr
><tr
id=sl_svn14_259

 onmouseover="gutterOver(259)"

><td class="source">			String currentInput =Path+fileName+&quot;.&quot;+fileExt;<br></td></tr
><tr
id=sl_svn14_260

 onmouseover="gutterOver(260)"

><td class="source">			String newOutput =Destination+fileName+&quot;.&quot;+fileExt;<br></td></tr
><tr
id=sl_svn14_261

 onmouseover="gutterOver(261)"

><td class="source">			InputStream in = new FileInputStream(currentInput);<br></td></tr
><tr
id=sl_svn14_262

 onmouseover="gutterOver(262)"

><td class="source">			OutputStream out = new FileOutputStream(newOutput);<br></td></tr
><tr
id=sl_svn14_263

 onmouseover="gutterOver(263)"

><td class="source">			byte[] buf = new byte[1024];<br></td></tr
><tr
id=sl_svn14_264

 onmouseover="gutterOver(264)"

><td class="source">			int len;<br></td></tr
><tr
id=sl_svn14_265

 onmouseover="gutterOver(265)"

><td class="source">			while ((len = in.read(buf)) &gt; 0) {<br></td></tr
><tr
id=sl_svn14_266

 onmouseover="gutterOver(266)"

><td class="source">			   out.write(buf, 0, len);<br></td></tr
><tr
id=sl_svn14_267

 onmouseover="gutterOver(267)"

><td class="source">			}<br></td></tr
><tr
id=sl_svn14_268

 onmouseover="gutterOver(268)"

><td class="source">			in.close();<br></td></tr
><tr
id=sl_svn14_269

 onmouseover="gutterOver(269)"

><td class="source">			out.close();<br></td></tr
><tr
id=sl_svn14_270

 onmouseover="gutterOver(270)"

><td class="source">		} catch (Exception error){<br></td></tr
><tr
id=sl_svn14_271

 onmouseover="gutterOver(271)"

><td class="source">			error.printStackTrace();<br></td></tr
><tr
id=sl_svn14_272

 onmouseover="gutterOver(272)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_273

 onmouseover="gutterOver(273)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_274

 onmouseover="gutterOver(274)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_275

 onmouseover="gutterOver(275)"

><td class="source">	 * Function name: moveFile<br></td></tr
><tr
id=sl_svn14_276

 onmouseover="gutterOver(276)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_277

 onmouseover="gutterOver(277)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_278

 onmouseover="gutterOver(278)"

><td class="source">	 * Move selected file to other location.<br></td></tr
><tr
id=sl_svn14_279

 onmouseover="gutterOver(279)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_280

 onmouseover="gutterOver(280)"

><td class="source">	 * @param fileName Name of file.<br></td></tr
><tr
id=sl_svn14_281

 onmouseover="gutterOver(281)"

><td class="source">	 * @param fileExt Type of the file extension.<br></td></tr
><tr
id=sl_svn14_282

 onmouseover="gutterOver(282)"

><td class="source">     * @param Path Directory path for the fileName.<br></td></tr
><tr
id=sl_svn14_283

 onmouseover="gutterOver(283)"

><td class="source">	 * @param Destination Directory Path for the copy file.<br></td></tr
><tr
id=sl_svn14_284

 onmouseover="gutterOver(284)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_285

 onmouseover="gutterOver(285)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_286

 onmouseover="gutterOver(286)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_287

 onmouseover="gutterOver(287)"

><td class="source">	 * function.moveFile(&quot;test&quot;, &quot;txt&quot;, &quot;C:/&quot;, &quot;C:/test/&quot;);<br></td></tr
><tr
id=sl_svn14_288

 onmouseover="gutterOver(288)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_289

 onmouseover="gutterOver(289)"

><td class="source">	public static void moveFile(String fileName, String fileExt, String Path, String Destination){<br></td></tr
><tr
id=sl_svn14_290

 onmouseover="gutterOver(290)"

><td class="source">		try{<br></td></tr
><tr
id=sl_svn14_291

 onmouseover="gutterOver(291)"

><td class="source">			 <br></td></tr
><tr
id=sl_svn14_292

 onmouseover="gutterOver(292)"

><td class="source">	    	   File afile =new File(Path+fileName+&quot;.&quot;+fileExt);<br></td></tr
><tr
id=sl_svn14_293

 onmouseover="gutterOver(293)"

><td class="source">	 <br></td></tr
><tr
id=sl_svn14_294

 onmouseover="gutterOver(294)"

><td class="source">	    	   if(afile.renameTo(new File(Destination + afile.getName()))){<br></td></tr
><tr
id=sl_svn14_295

 onmouseover="gutterOver(295)"

><td class="source">	    		System.out.println(&quot;File is moved successful!&quot;);<br></td></tr
><tr
id=sl_svn14_296

 onmouseover="gutterOver(296)"

><td class="source">	    	   }else{<br></td></tr
><tr
id=sl_svn14_297

 onmouseover="gutterOver(297)"

><td class="source">	    		System.out.println(&quot;File is failed to move!&quot;);<br></td></tr
><tr
id=sl_svn14_298

 onmouseover="gutterOver(298)"

><td class="source">	    	   }<br></td></tr
><tr
id=sl_svn14_299

 onmouseover="gutterOver(299)"

><td class="source">	 <br></td></tr
><tr
id=sl_svn14_300

 onmouseover="gutterOver(300)"

><td class="source">	    	}catch(Exception e){<br></td></tr
><tr
id=sl_svn14_301

 onmouseover="gutterOver(301)"

><td class="source">	    		e.printStackTrace();<br></td></tr
><tr
id=sl_svn14_302

 onmouseover="gutterOver(302)"

><td class="source">	    	}<br></td></tr
><tr
id=sl_svn14_303

 onmouseover="gutterOver(303)"

><td class="source">	}	<br></td></tr
><tr
id=sl_svn14_304

 onmouseover="gutterOver(304)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_305

 onmouseover="gutterOver(305)"

><td class="source">	 * Function name: moveFolder<br></td></tr
><tr
id=sl_svn14_306

 onmouseover="gutterOver(306)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_307

 onmouseover="gutterOver(307)"

><td class="source">     * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_308

 onmouseover="gutterOver(308)"

><td class="source">	 * Move selected folder to other location.<br></td></tr
><tr
id=sl_svn14_309

 onmouseover="gutterOver(309)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_310

 onmouseover="gutterOver(310)"

><td class="source">     * @param srcDir Directory path to be move.<br></td></tr
><tr
id=sl_svn14_311

 onmouseover="gutterOver(311)"

><td class="source">	 * @param destDir Destination directory Path.<br></td></tr
><tr
id=sl_svn14_312

 onmouseover="gutterOver(312)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_313

 onmouseover="gutterOver(313)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_314

 onmouseover="gutterOver(314)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_315

 onmouseover="gutterOver(315)"

><td class="source">	 * function.moveFolder(&quot;C://test1&quot;, &quot;C://test2/&quot;);<br></td></tr
><tr
id=sl_svn14_316

 onmouseover="gutterOver(316)"

><td class="source">	 */		 <br></td></tr
><tr
id=sl_svn14_317

 onmouseover="gutterOver(317)"

><td class="source">	public static void moveFolder(String srcDir, String destDir) throws IOException{<br></td></tr
><tr
id=sl_svn14_318

 onmouseover="gutterOver(318)"

><td class="source">	   File srcFileFolder = new File(srcDir);<br></td></tr
><tr
id=sl_svn14_319

 onmouseover="gutterOver(319)"

><td class="source">	   File destFileFolder = new File (destDir);	<br></td></tr
><tr
id=sl_svn14_320

 onmouseover="gutterOver(320)"

><td class="source">	   copyFolderActual (srcFileFolder, destFileFolder);<br></td></tr
><tr
id=sl_svn14_321

 onmouseover="gutterOver(321)"

><td class="source">	   deleteFolder(srcDir); //Eliminate dependecies between copy &amp; delete<br></td></tr
><tr
id=sl_svn14_322

 onmouseover="gutterOver(322)"

><td class="source">	    }<br></td></tr
><tr
id=sl_svn14_323

 onmouseover="gutterOver(323)"

><td class="source">	public static void copyFolderActual(File src, File dest)throws IOException{<br></td></tr
><tr
id=sl_svn14_324

 onmouseover="gutterOver(324)"

><td class="source">	 if(src.isDirectory()){<br></td></tr
><tr
id=sl_svn14_325

 onmouseover="gutterOver(325)"

><td class="source">	 //Check destination, if invalid then create one<br></td></tr
><tr
id=sl_svn14_326

 onmouseover="gutterOver(326)"

><td class="source">	 if(!dest.exists()){<br></td></tr
><tr
id=sl_svn14_327

 onmouseover="gutterOver(327)"

><td class="source">	 dest.mkdir();<br></td></tr
><tr
id=sl_svn14_328

 onmouseover="gutterOver(328)"

><td class="source">	 System.out.println(&quot;Executed: Folder moved from &quot;+ src + &quot;, copy to &quot; + dest);<br></td></tr
><tr
id=sl_svn14_329

 onmouseover="gutterOver(329)"

><td class="source">	 }<br></td></tr
><tr
id=sl_svn14_330

 onmouseover="gutterOver(330)"

><td class="source">	 //list all the directory contents<br></td></tr
><tr
id=sl_svn14_331

 onmouseover="gutterOver(331)"

><td class="source">	 String files[] = src.list();<br></td></tr
><tr
id=sl_svn14_332

 onmouseover="gutterOver(332)"

><td class="source">	 for (String file : files) {<br></td></tr
><tr
id=sl_svn14_333

 onmouseover="gutterOver(333)"

><td class="source">	 //Constructor to defined source and destination structure<br></td></tr
><tr
id=sl_svn14_334

 onmouseover="gutterOver(334)"

><td class="source">	 File srcFile = new File(src, file);<br></td></tr
><tr
id=sl_svn14_335

 onmouseover="gutterOver(335)"

><td class="source">	 File destFile = new File(dest, file);<br></td></tr
><tr
id=sl_svn14_336

 onmouseover="gutterOver(336)"

><td class="source">	 //Copy recursively<br></td></tr
><tr
id=sl_svn14_337

 onmouseover="gutterOver(337)"

><td class="source">	 copyFolderActual(srcFile,destFile);<br></td></tr
><tr
id=sl_svn14_338

 onmouseover="gutterOver(338)"

><td class="source">	 	}<br></td></tr
><tr
id=sl_svn14_339

 onmouseover="gutterOver(339)"

><td class="source">	 }<br></td></tr
><tr
id=sl_svn14_340

 onmouseover="gutterOver(340)"

><td class="source">	 else{<br></td></tr
><tr
id=sl_svn14_341

 onmouseover="gutterOver(341)"

><td class="source">	 //Byte stream method to support all type of file<br></td></tr
><tr
id=sl_svn14_342

 onmouseover="gutterOver(342)"

><td class="source">	 InputStream in = new FileInputStream(src);<br></td></tr
><tr
id=sl_svn14_343

 onmouseover="gutterOver(343)"

><td class="source">	 OutputStream out = new FileOutputStream(dest); <br></td></tr
><tr
id=sl_svn14_344

 onmouseover="gutterOver(344)"

><td class="source">	 File fileDelete = new File (src.toString());   	        <br></td></tr
><tr
id=sl_svn14_345

 onmouseover="gutterOver(345)"

><td class="source">	 byte[] buffer = new byte[1024];<br></td></tr
><tr
id=sl_svn14_346

 onmouseover="gutterOver(346)"

><td class="source">	 int length;      <br></td></tr
><tr
id=sl_svn14_347

 onmouseover="gutterOver(347)"

><td class="source">	 //Copy all file in bytes translation <br></td></tr
><tr
id=sl_svn14_348

 onmouseover="gutterOver(348)"

><td class="source">	 while ((length = in.read(buffer)) &gt; 0){<br></td></tr
><tr
id=sl_svn14_349

 onmouseover="gutterOver(349)"

><td class="source">	 out.write(buffer, 0, length);<br></td></tr
><tr
id=sl_svn14_350

 onmouseover="gutterOver(350)"

><td class="source">	   }	        <br></td></tr
><tr
id=sl_svn14_351

 onmouseover="gutterOver(351)"

><td class="source">	   //Close the input &amp; output stream<br></td></tr
><tr
id=sl_svn14_352

 onmouseover="gutterOver(352)"

><td class="source">	   in.close();<br></td></tr
><tr
id=sl_svn14_353

 onmouseover="gutterOver(353)"

><td class="source">	   out.close();<br></td></tr
><tr
id=sl_svn14_354

 onmouseover="gutterOver(354)"

><td class="source">	  System.out.println(&quot;Executed: File Moved from &quot; + src + &quot; to &quot; + dest);<br></td></tr
><tr
id=sl_svn14_355

 onmouseover="gutterOver(355)"

><td class="source">	   	}<br></td></tr
><tr
id=sl_svn14_356

 onmouseover="gutterOver(356)"

><td class="source">	  //deleteFolder(src.toString());  ////Commenting out, Eliminate dependecies between copy &amp; delete<br></td></tr
><tr
id=sl_svn14_357

 onmouseover="gutterOver(357)"

><td class="source">	}	<br></td></tr
><tr
id=sl_svn14_358

 onmouseover="gutterOver(358)"

><td class="source">    /**<br></td></tr
><tr
id=sl_svn14_359

 onmouseover="gutterOver(359)"

><td class="source">	 * Function name: copyAllFile<br></td></tr
><tr
id=sl_svn14_360

 onmouseover="gutterOver(360)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_361

 onmouseover="gutterOver(361)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_362

 onmouseover="gutterOver(362)"

><td class="source">	 * Copy all file in the folder to other location.<br></td></tr
><tr
id=sl_svn14_363

 onmouseover="gutterOver(363)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_364

 onmouseover="gutterOver(364)"

><td class="source">	 * @param srcDir Source directory for files.<br></td></tr
><tr
id=sl_svn14_365

 onmouseover="gutterOver(365)"

><td class="source">	 * @param destDir Destination directory for files to be copy to.<br></td></tr
><tr
id=sl_svn14_366

 onmouseover="gutterOver(366)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_367

 onmouseover="gutterOver(367)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_368

 onmouseover="gutterOver(368)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_369

 onmouseover="gutterOver(369)"

><td class="source">	 * function.copyAllFiles(&quot;C://test1&quot;, &quot;C://test2/&quot;);<br></td></tr
><tr
id=sl_svn14_370

 onmouseover="gutterOver(370)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_371

 onmouseover="gutterOver(371)"

><td class="source">	public static void copyAllFiles(String srcDir, String destDir) throws IOException{<br></td></tr
><tr
id=sl_svn14_372

 onmouseover="gutterOver(372)"

><td class="source">	    	File srcFileFolder = new File(srcDir);<br></td></tr
><tr
id=sl_svn14_373

 onmouseover="gutterOver(373)"

><td class="source">	    	File destFileFolder = new File (destDir);	<br></td></tr
><tr
id=sl_svn14_374

 onmouseover="gutterOver(374)"

><td class="source">	    	copyAllFileActual (srcFileFolder, destFileFolder);<br></td></tr
><tr
id=sl_svn14_375

 onmouseover="gutterOver(375)"

><td class="source">	    }<br></td></tr
><tr
id=sl_svn14_376

 onmouseover="gutterOver(376)"

><td class="source">	public static void copyAllFileActual(File src, File dest)throws IOException{<br></td></tr
><tr
id=sl_svn14_377

 onmouseover="gutterOver(377)"

><td class="source">	 <br></td></tr
><tr
id=sl_svn14_378

 onmouseover="gutterOver(378)"

><td class="source">	    	if(src.isDirectory()){<br></td></tr
><tr
id=sl_svn14_379

 onmouseover="gutterOver(379)"

><td class="source">	    		<br></td></tr
><tr
id=sl_svn14_380

 onmouseover="gutterOver(380)"

><td class="source">	    		//Check destination, if invalid then create one<br></td></tr
><tr
id=sl_svn14_381

 onmouseover="gutterOver(381)"

><td class="source">	    		if(!dest.exists()){<br></td></tr
><tr
id=sl_svn14_382

 onmouseover="gutterOver(382)"

><td class="source">	    		   dest.mkdir();<br></td></tr
><tr
id=sl_svn14_383

 onmouseover="gutterOver(383)"

><td class="source">	    		   System.out.println(&quot;Executed: Folder moved from &quot;+ src + &quot;, copy to &quot; + dest);<br></td></tr
><tr
id=sl_svn14_384

 onmouseover="gutterOver(384)"

><td class="source">	    		}<br></td></tr
><tr
id=sl_svn14_385

 onmouseover="gutterOver(385)"

><td class="source">	 <br></td></tr
><tr
id=sl_svn14_386

 onmouseover="gutterOver(386)"

><td class="source">	    		//list all the directory contents<br></td></tr
><tr
id=sl_svn14_387

 onmouseover="gutterOver(387)"

><td class="source">	    		String files[] = src.list();<br></td></tr
><tr
id=sl_svn14_388

 onmouseover="gutterOver(388)"

><td class="source">	    		for (String file : files) {<br></td></tr
><tr
id=sl_svn14_389

 onmouseover="gutterOver(389)"

><td class="source">	    		   //Constructor to defined source and destination structure<br></td></tr
><tr
id=sl_svn14_390

 onmouseover="gutterOver(390)"

><td class="source">	    		   File srcFile = new File(src, file);<br></td></tr
><tr
id=sl_svn14_391

 onmouseover="gutterOver(391)"

><td class="source">	    		   File destFile = new File(dest, file);<br></td></tr
><tr
id=sl_svn14_392

 onmouseover="gutterOver(392)"

><td class="source">	    		   //Copy recursively<br></td></tr
><tr
id=sl_svn14_393

 onmouseover="gutterOver(393)"

><td class="source">	    		   copyFolderActual(srcFile,destFile);<br></td></tr
><tr
id=sl_svn14_394

 onmouseover="gutterOver(394)"

><td class="source">	    		}<br></td></tr
><tr
id=sl_svn14_395

 onmouseover="gutterOver(395)"

><td class="source">	    	}<br></td></tr
><tr
id=sl_svn14_396

 onmouseover="gutterOver(396)"

><td class="source">	    	else{<br></td></tr
><tr
id=sl_svn14_397

 onmouseover="gutterOver(397)"

><td class="source">	    		//Bytes stream method to support all type of file<br></td></tr
><tr
id=sl_svn14_398

 onmouseover="gutterOver(398)"

><td class="source">	    		InputStream in = new FileInputStream(src);<br></td></tr
><tr
id=sl_svn14_399

 onmouseover="gutterOver(399)"

><td class="source">	    	    OutputStream out = new FileOutputStream(dest); <br></td></tr
><tr
id=sl_svn14_400

 onmouseover="gutterOver(400)"

><td class="source">	    	    File fileDelete = new File (src.toString());<br></td></tr
><tr
id=sl_svn14_401

 onmouseover="gutterOver(401)"

><td class="source">	    	    byte[] buffer = new byte[1024];<br></td></tr
><tr
id=sl_svn14_402

 onmouseover="gutterOver(402)"

><td class="source">	    	    int length;<br></td></tr
><tr
id=sl_svn14_403

 onmouseover="gutterOver(403)"

><td class="source">	    	        <br></td></tr
><tr
id=sl_svn14_404

 onmouseover="gutterOver(404)"

><td class="source">	    	    //Copy all file in bytes translation <br></td></tr
><tr
id=sl_svn14_405

 onmouseover="gutterOver(405)"

><td class="source">	    	    while ((length = in.read(buffer)) &gt; 0){<br></td></tr
><tr
id=sl_svn14_406

 onmouseover="gutterOver(406)"

><td class="source">	    	    out.write(buffer, 0, length);<br></td></tr
><tr
id=sl_svn14_407

 onmouseover="gutterOver(407)"

><td class="source">	    	    }<br></td></tr
><tr
id=sl_svn14_408

 onmouseover="gutterOver(408)"

><td class="source">	    	        <br></td></tr
><tr
id=sl_svn14_409

 onmouseover="gutterOver(409)"

><td class="source">	    	    //Close the input &amp; output stream<br></td></tr
><tr
id=sl_svn14_410

 onmouseover="gutterOver(410)"

><td class="source">	    	    in.close();<br></td></tr
><tr
id=sl_svn14_411

 onmouseover="gutterOver(411)"

><td class="source">	    	    out.close();<br></td></tr
><tr
id=sl_svn14_412

 onmouseover="gutterOver(412)"

><td class="source">	    	    System.out.println(&quot;Executed: Copy all files from &quot; + src + &quot; to &quot; + dest);<br></td></tr
><tr
id=sl_svn14_413

 onmouseover="gutterOver(413)"

><td class="source">	    	}<br></td></tr
><tr
id=sl_svn14_414

 onmouseover="gutterOver(414)"

><td class="source">	}	   <br></td></tr
><tr
id=sl_svn14_415

 onmouseover="gutterOver(415)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_416

 onmouseover="gutterOver(416)"

><td class="source">	 * Function name: deleteFolder<br></td></tr
><tr
id=sl_svn14_417

 onmouseover="gutterOver(417)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_418

 onmouseover="gutterOver(418)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_419

 onmouseover="gutterOver(419)"

><td class="source">	 * Copy all file in the folder to other location.<br></td></tr
><tr
id=sl_svn14_420

 onmouseover="gutterOver(420)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_421

 onmouseover="gutterOver(421)"

><td class="source">	 * @param srcDir Source directory to be deleted.<br></td></tr
><tr
id=sl_svn14_422

 onmouseover="gutterOver(422)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_423

 onmouseover="gutterOver(423)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_424

 onmouseover="gutterOver(424)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_425

 onmouseover="gutterOver(425)"

><td class="source">	 * function.deleteFolder(&quot;C://test1&quot;);<br></td></tr
><tr
id=sl_svn14_426

 onmouseover="gutterOver(426)"

><td class="source">	 */   <br></td></tr
><tr
id=sl_svn14_427

 onmouseover="gutterOver(427)"

><td class="source">	public static void deleteFolder(String srcDir){<br></td></tr
><tr
id=sl_svn14_428

 onmouseover="gutterOver(428)"

><td class="source">	    	File deleteFolder = new File (srcDir);<br></td></tr
><tr
id=sl_svn14_429

 onmouseover="gutterOver(429)"

><td class="source">	    	if(deleteFolder.exists())<br></td></tr
><tr
id=sl_svn14_430

 onmouseover="gutterOver(430)"

><td class="source">	        {<br></td></tr
><tr
id=sl_svn14_431

 onmouseover="gutterOver(431)"

><td class="source">	            do{<br></td></tr
><tr
id=sl_svn14_432

 onmouseover="gutterOver(432)"

><td class="source">	                delete(deleteFolder);<br></td></tr
><tr
id=sl_svn14_433

 onmouseover="gutterOver(433)"

><td class="source">	            }while(deleteFolder.exists());<br></td></tr
><tr
id=sl_svn14_434

 onmouseover="gutterOver(434)"

><td class="source">	        }else<br></td></tr
><tr
id=sl_svn14_435

 onmouseover="gutterOver(435)"

><td class="source">	        {<br></td></tr
><tr
id=sl_svn14_436

 onmouseover="gutterOver(436)"

><td class="source">	            System.out.println(&quot;Error!: Folder not found: &quot;+srcDir);<br></td></tr
><tr
id=sl_svn14_437

 onmouseover="gutterOver(437)"

><td class="source">	        }<br></td></tr
><tr
id=sl_svn14_438

 onmouseover="gutterOver(438)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_439

 onmouseover="gutterOver(439)"

><td class="source">	private static void delete(File dir){<br></td></tr
><tr
id=sl_svn14_440

 onmouseover="gutterOver(440)"

><td class="source">	    if(dir.isDirectory())<br></td></tr
><tr
id=sl_svn14_441

 onmouseover="gutterOver(441)"

><td class="source">	        {<br></td></tr
><tr
id=sl_svn14_442

 onmouseover="gutterOver(442)"

><td class="source">	    	String fileList[] = dir.list();<br></td></tr
><tr
id=sl_svn14_443

 onmouseover="gutterOver(443)"

><td class="source">	    	if(fileList.length == 0)<br></td></tr
><tr
id=sl_svn14_444

 onmouseover="gutterOver(444)"

><td class="source">	    	{<br></td></tr
><tr
id=sl_svn14_445

 onmouseover="gutterOver(445)"

><td class="source">	    		System.out.println(&quot;Executed: Folder &quot;+dir.getPath()+&quot; deleted.&quot;);<br></td></tr
><tr
id=sl_svn14_446

 onmouseover="gutterOver(446)"

><td class="source">	            dir.delete();<br></td></tr
><tr
id=sl_svn14_447

 onmouseover="gutterOver(447)"

><td class="source">	            }<br></td></tr
><tr
id=sl_svn14_448

 onmouseover="gutterOver(448)"

><td class="source">	    	else{<br></td></tr
><tr
id=sl_svn14_449

 onmouseover="gutterOver(449)"

><td class="source">	    		int size = fileList.length;<br></td></tr
><tr
id=sl_svn14_450

 onmouseover="gutterOver(450)"

><td class="source">	            for(int i = 0 ; i &lt; size ; i++)<br></td></tr
><tr
id=sl_svn14_451

 onmouseover="gutterOver(451)"

><td class="source">	            {<br></td></tr
><tr
id=sl_svn14_452

 onmouseover="gutterOver(452)"

><td class="source">	            	String fileName = fileList[i];<br></td></tr
><tr
id=sl_svn14_453

 onmouseover="gutterOver(453)"

><td class="source">	                String fullPath = dir.getPath()+&quot;/&quot;+fileName;<br></td></tr
><tr
id=sl_svn14_454

 onmouseover="gutterOver(454)"

><td class="source">	                File fileOrFolder = new File(fullPath);<br></td></tr
><tr
id=sl_svn14_455

 onmouseover="gutterOver(455)"

><td class="source">	                delete(fileOrFolder);<br></td></tr
><tr
id=sl_svn14_456

 onmouseover="gutterOver(456)"

><td class="source">	                }<br></td></tr
><tr
id=sl_svn14_457

 onmouseover="gutterOver(457)"

><td class="source">	            }<br></td></tr
><tr
id=sl_svn14_458

 onmouseover="gutterOver(458)"

><td class="source">	        }<br></td></tr
><tr
id=sl_svn14_459

 onmouseover="gutterOver(459)"

><td class="source">	        else{<br></td></tr
><tr
id=sl_svn14_460

 onmouseover="gutterOver(460)"

><td class="source">	            System.out.println(&quot;Executed: File &quot;+dir.getPath()+&quot; deleted.&quot;);<br></td></tr
><tr
id=sl_svn14_461

 onmouseover="gutterOver(461)"

><td class="source">	            dir.delete();<br></td></tr
><tr
id=sl_svn14_462

 onmouseover="gutterOver(462)"

><td class="source">	        }<br></td></tr
><tr
id=sl_svn14_463

 onmouseover="gutterOver(463)"

><td class="source">	    }	<br></td></tr
><tr
id=sl_svn14_464

 onmouseover="gutterOver(464)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_465

 onmouseover="gutterOver(465)"

><td class="source">	 * Function name: zipFolder<br></td></tr
><tr
id=sl_svn14_466

 onmouseover="gutterOver(466)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_467

 onmouseover="gutterOver(467)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_468

 onmouseover="gutterOver(468)"

><td class="source">	 * Pointed folder will compressed into zip file and store in the same directory.<br></td></tr
><tr
id=sl_svn14_469

 onmouseover="gutterOver(469)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_470

 onmouseover="gutterOver(470)"

><td class="source">	 * @param srcDir Folder directory to be zip.<br></td></tr
><tr
id=sl_svn14_471

 onmouseover="gutterOver(471)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_472

 onmouseover="gutterOver(472)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_473

 onmouseover="gutterOver(473)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_474

 onmouseover="gutterOver(474)"

><td class="source">	 * function.zipFolder(&quot;C://test1&quot;);<br></td></tr
><tr
id=sl_svn14_475

 onmouseover="gutterOver(475)"

><td class="source">	 */   <br></td></tr
><tr
id=sl_svn14_476

 onmouseover="gutterOver(476)"

><td class="source">	public static void zipFolder(String srcDir) throws Exception {<br></td></tr
><tr
id=sl_svn14_477

 onmouseover="gutterOver(477)"

><td class="source">		String destZipFile = srcDir+&quot;.zip&quot;;<br></td></tr
><tr
id=sl_svn14_478

 onmouseover="gutterOver(478)"

><td class="source">		ZipOutputStream zip = null;<br></td></tr
><tr
id=sl_svn14_479

 onmouseover="gutterOver(479)"

><td class="source">	    FileOutputStream writeOut = null;<br></td></tr
><tr
id=sl_svn14_480

 onmouseover="gutterOver(480)"

><td class="source">	    //Declare output method<br></td></tr
><tr
id=sl_svn14_481

 onmouseover="gutterOver(481)"

><td class="source">	    writeOut = new FileOutputStream(destZipFile);<br></td></tr
><tr
id=sl_svn14_482

 onmouseover="gutterOver(482)"

><td class="source">	    zip = new ZipOutputStream(writeOut);<br></td></tr
><tr
id=sl_svn14_483

 onmouseover="gutterOver(483)"

><td class="source">	    //Zipping execution<br></td></tr
><tr
id=sl_svn14_484

 onmouseover="gutterOver(484)"

><td class="source">	    ZipFolder(&quot;&quot;, srcDir, zip);<br></td></tr
><tr
id=sl_svn14_485

 onmouseover="gutterOver(485)"

><td class="source">	    zip.flush();<br></td></tr
><tr
id=sl_svn14_486

 onmouseover="gutterOver(486)"

><td class="source">	    zip.close();<br></td></tr
><tr
id=sl_svn14_487

 onmouseover="gutterOver(487)"

><td class="source">	    System.out.println(&quot;Executed: Folder &quot;+srcDir+&quot; compressed.&quot;);<br></td></tr
><tr
id=sl_svn14_488

 onmouseover="gutterOver(488)"

><td class="source">	  }<br></td></tr
><tr
id=sl_svn14_489

 onmouseover="gutterOver(489)"

><td class="source">	static private void ZipFolder(String path, String srcFolder, ZipOutputStream zip)throws Exception {<br></td></tr
><tr
id=sl_svn14_490

 onmouseover="gutterOver(490)"

><td class="source">		File folder = new File(srcFolder);<br></td></tr
><tr
id=sl_svn14_491

 onmouseover="gutterOver(491)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_492

 onmouseover="gutterOver(492)"

><td class="source">		for (String fileName : folder.list()) {<br></td></tr
><tr
id=sl_svn14_493

 onmouseover="gutterOver(493)"

><td class="source">	      if (path.equals(&quot;&quot;)) {<br></td></tr
><tr
id=sl_svn14_494

 onmouseover="gutterOver(494)"

><td class="source">	    	  ZipFile(folder.getName(), srcFolder + &quot;/&quot; + fileName, zip);<br></td></tr
><tr
id=sl_svn14_495

 onmouseover="gutterOver(495)"

><td class="source">	      } <br></td></tr
><tr
id=sl_svn14_496

 onmouseover="gutterOver(496)"

><td class="source">	      else{<br></td></tr
><tr
id=sl_svn14_497

 onmouseover="gutterOver(497)"

><td class="source">	    	  ZipFile(path + &quot;/&quot; + folder.getName(), srcFolder + &quot;/&quot; + fileName, zip);<br></td></tr
><tr
id=sl_svn14_498

 onmouseover="gutterOver(498)"

><td class="source">	      }<br></td></tr
><tr
id=sl_svn14_499

 onmouseover="gutterOver(499)"

><td class="source">	    }<br></td></tr
><tr
id=sl_svn14_500

 onmouseover="gutterOver(500)"

><td class="source">	  } <br></td></tr
><tr
id=sl_svn14_501

 onmouseover="gutterOver(501)"

><td class="source">	static private void ZipFile(String path, String srcFile, ZipOutputStream zip)throws Exception {<br></td></tr
><tr
id=sl_svn14_502

 onmouseover="gutterOver(502)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_503

 onmouseover="gutterOver(503)"

><td class="source">	    File folder = new File(srcFile);<br></td></tr
><tr
id=sl_svn14_504

 onmouseover="gutterOver(504)"

><td class="source">	    if (folder.isDirectory()) {<br></td></tr
><tr
id=sl_svn14_505

 onmouseover="gutterOver(505)"

><td class="source">	    	ZipFolder(path, srcFile, zip);<br></td></tr
><tr
id=sl_svn14_506

 onmouseover="gutterOver(506)"

><td class="source">	    } <br></td></tr
><tr
id=sl_svn14_507

 onmouseover="gutterOver(507)"

><td class="source">	    else{<br></td></tr
><tr
id=sl_svn14_508

 onmouseover="gutterOver(508)"

><td class="source">	      byte[] buf = new byte[1024];<br></td></tr
><tr
id=sl_svn14_509

 onmouseover="gutterOver(509)"

><td class="source">	      int len;<br></td></tr
><tr
id=sl_svn14_510

 onmouseover="gutterOver(510)"

><td class="source">	      FileInputStream in = new FileInputStream(srcFile);<br></td></tr
><tr
id=sl_svn14_511

 onmouseover="gutterOver(511)"

><td class="source">	      zip.putNextEntry(new ZipEntry(path + &quot;/&quot; + folder.getName()));<br></td></tr
><tr
id=sl_svn14_512

 onmouseover="gutterOver(512)"

><td class="source">	      while ((len = in.read(buf)) &gt; 0) {<br></td></tr
><tr
id=sl_svn14_513

 onmouseover="gutterOver(513)"

><td class="source">	        zip.write(buf, 0, len);<br></td></tr
><tr
id=sl_svn14_514

 onmouseover="gutterOver(514)"

><td class="source">	      }<br></td></tr
><tr
id=sl_svn14_515

 onmouseover="gutterOver(515)"

><td class="source">	    }<br></td></tr
><tr
id=sl_svn14_516

 onmouseover="gutterOver(516)"

><td class="source">	  } <br></td></tr
><tr
id=sl_svn14_517

 onmouseover="gutterOver(517)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_518

 onmouseover="gutterOver(518)"

><td class="source">	 * Function name: unzipFolder<br></td></tr
><tr
id=sl_svn14_519

 onmouseover="gutterOver(519)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_520

 onmouseover="gutterOver(520)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_521

 onmouseover="gutterOver(521)"

><td class="source">	 * Pointed folder will compressed into zip file and store in the same directory.<br></td></tr
><tr
id=sl_svn14_522

 onmouseover="gutterOver(522)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_523

 onmouseover="gutterOver(523)"

><td class="source">	 * @param srcDir Source directory of zipped folder.<br></td></tr
><tr
id=sl_svn14_524

 onmouseover="gutterOver(524)"

><td class="source">	 * @param destDir Destination directory to be extract.<br></td></tr
><tr
id=sl_svn14_525

 onmouseover="gutterOver(525)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_526

 onmouseover="gutterOver(526)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_527

 onmouseover="gutterOver(527)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_528

 onmouseover="gutterOver(528)"

><td class="source">	 * function.unzipFolder(&quot;C://test/test1.zip&quot;, &quot;C://test/&quot;);<br></td></tr
><tr
id=sl_svn14_529

 onmouseover="gutterOver(529)"

><td class="source">	 */   <br></td></tr
><tr
id=sl_svn14_530

 onmouseover="gutterOver(530)"

><td class="source">	public static void unzipFolder( String srcDir, String destDir ) {<br></td></tr
><tr
id=sl_svn14_531

 onmouseover="gutterOver(531)"

><td class="source">		try {<br></td></tr
><tr
id=sl_svn14_532

 onmouseover="gutterOver(532)"

><td class="source">			ZipFile zipfile = new ZipFile(srcDir);<br></td></tr
><tr
id=sl_svn14_533

 onmouseover="gutterOver(533)"

><td class="source">			Enumeration&lt; ? extends ZipEntry&gt; zipEnum = zipfile.entries();<br></td></tr
><tr
id=sl_svn14_534

 onmouseover="gutterOver(534)"

><td class="source">			<br></td></tr
><tr
id=sl_svn14_535

 onmouseover="gutterOver(535)"

><td class="source">				while( zipEnum.hasMoreElements() ) {<br></td></tr
><tr
id=sl_svn14_536

 onmouseover="gutterOver(536)"

><td class="source">					ZipEntry zipentry = (ZipEntry) zipEnum.nextElement();<br></td></tr
><tr
id=sl_svn14_537

 onmouseover="gutterOver(537)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_538

 onmouseover="gutterOver(538)"

><td class="source">					if (zipentry.isDirectory()) {<br></td></tr
><tr
id=sl_svn14_539

 onmouseover="gutterOver(539)"

><td class="source">						File newdir = new File(destDir + File.separator + zipentry.getName());<br></td></tr
><tr
id=sl_svn14_540

 onmouseover="gutterOver(540)"

><td class="source">						newdir.mkdir();<br></td></tr
><tr
id=sl_svn14_541

 onmouseover="gutterOver(541)"

><td class="source">					} <br></td></tr
><tr
id=sl_svn14_542

 onmouseover="gutterOver(542)"

><td class="source">					else{<br></td></tr
><tr
id=sl_svn14_543

 onmouseover="gutterOver(543)"

><td class="source">						String extractPath = destDir + File.separator + zipentry.getName();<br></td></tr
><tr
id=sl_svn14_544

 onmouseover="gutterOver(544)"

><td class="source">						File extractFile = new File(extractPath);<br></td></tr
><tr
id=sl_svn14_545

 onmouseover="gutterOver(545)"

><td class="source">						if (!extractFile.getParentFile().exists()) {<br></td></tr
><tr
id=sl_svn14_546

 onmouseover="gutterOver(546)"

><td class="source">							extractFile.getParentFile().mkdirs();<br></td></tr
><tr
id=sl_svn14_547

 onmouseover="gutterOver(547)"

><td class="source">						}else{<br></td></tr
><tr
id=sl_svn14_548

 onmouseover="gutterOver(548)"

><td class="source">							System.out.println(&quot;Info: Folder and data &quot;+&#39;&quot;&#39;+zipentry.getName()+&#39;&quot;&#39;+&quot; already existed at extract location.&quot;);<br></td></tr
><tr
id=sl_svn14_549

 onmouseover="gutterOver(549)"

><td class="source">							System.out.println(&quot;Info: Replace existing content with new extract data.&quot;);<br></td></tr
><tr
id=sl_svn14_550

 onmouseover="gutterOver(550)"

><td class="source">						}<br></td></tr
><tr
id=sl_svn14_551

 onmouseover="gutterOver(551)"

><td class="source">	        <br></td></tr
><tr
id=sl_svn14_552

 onmouseover="gutterOver(552)"

><td class="source">						InputStream input = zipfile.getInputStream(zipentry);<br></td></tr
><tr
id=sl_svn14_553

 onmouseover="gutterOver(553)"

><td class="source">						FileOutputStream output = new FileOutputStream(extractPath);<br></td></tr
><tr
id=sl_svn14_554

 onmouseover="gutterOver(554)"

><td class="source">						int x;<br></td></tr
><tr
id=sl_svn14_555

 onmouseover="gutterOver(555)"

><td class="source">						while( (x = input.read()) != -1 ) {<br></td></tr
><tr
id=sl_svn14_556

 onmouseover="gutterOver(556)"

><td class="source">							output.write(x);<br></td></tr
><tr
id=sl_svn14_557

 onmouseover="gutterOver(557)"

><td class="source">						}<br></td></tr
><tr
id=sl_svn14_558

 onmouseover="gutterOver(558)"

><td class="source">						input.close();<br></td></tr
><tr
id=sl_svn14_559

 onmouseover="gutterOver(559)"

><td class="source">						output.close();<br></td></tr
><tr
id=sl_svn14_560

 onmouseover="gutterOver(560)"

><td class="source">					}<br></td></tr
><tr
id=sl_svn14_561

 onmouseover="gutterOver(561)"

><td class="source">				}<br></td></tr
><tr
id=sl_svn14_562

 onmouseover="gutterOver(562)"

><td class="source">				zipfile.close();<br></td></tr
><tr
id=sl_svn14_563

 onmouseover="gutterOver(563)"

><td class="source">				System.out.println(&quot;Executed: Folder &quot;+srcDir+&quot; successfully extracted.&quot;);<br></td></tr
><tr
id=sl_svn14_564

 onmouseover="gutterOver(564)"

><td class="source">				System.out.println(&quot;Extract location: &quot;+destDir);<br></td></tr
><tr
id=sl_svn14_565

 onmouseover="gutterOver(565)"

><td class="source">				} catch (Exception e) {<br></td></tr
><tr
id=sl_svn14_566

 onmouseover="gutterOver(566)"

><td class="source">					e.printStackTrace();<br></td></tr
><tr
id=sl_svn14_567

 onmouseover="gutterOver(567)"

><td class="source">				}<br></td></tr
><tr
id=sl_svn14_568

 onmouseover="gutterOver(568)"

><td class="source">	}	<br></td></tr
><tr
id=sl_svn14_569

 onmouseover="gutterOver(569)"

><td class="source">	/**<br></td></tr
><tr
id=sl_svn14_570

 onmouseover="gutterOver(570)"

><td class="source">	 * Function name: renameFile<br></td></tr
><tr
id=sl_svn14_571

 onmouseover="gutterOver(571)"

><td class="source">	 * <br></td></tr
><tr
id=sl_svn14_572

 onmouseover="gutterOver(572)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_573

 onmouseover="gutterOver(573)"

><td class="source">	 * Rename a file.<br></td></tr
><tr
id=sl_svn14_574

 onmouseover="gutterOver(574)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_575

 onmouseover="gutterOver(575)"

><td class="source">	 * @param srcFileName Original file.<br></td></tr
><tr
id=sl_svn14_576

 onmouseover="gutterOver(576)"

><td class="source">	 * @param newFileName Renamed file.<br></td></tr
><tr
id=sl_svn14_577

 onmouseover="gutterOver(577)"

><td class="source">	 * @param Path directory path.<br></td></tr
><tr
id=sl_svn14_578

 onmouseover="gutterOver(578)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_579

 onmouseover="gutterOver(579)"

><td class="source">	 * Example:<br></td></tr
><tr
id=sl_svn14_580

 onmouseover="gutterOver(580)"

><td class="source">	 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_581

 onmouseover="gutterOver(581)"

><td class="source">	 * function.unzipFolder(&quot;test1.zip&quot;, &quot;test2.zip&quot;, &quot;C://test&quot;);<br></td></tr
><tr
id=sl_svn14_582

 onmouseover="gutterOver(582)"

><td class="source">	 */<br></td></tr
><tr
id=sl_svn14_583

 onmouseover="gutterOver(583)"

><td class="source">	public static void renameFile(String srcFileName, String newFileName, String Path){<br></td></tr
><tr
id=sl_svn14_584

 onmouseover="gutterOver(584)"

><td class="source">		File file1 = new File (Path+&quot;/&quot;+srcFileName);<br></td></tr
><tr
id=sl_svn14_585

 onmouseover="gutterOver(585)"

><td class="source">		File file2 = new File (Path+&quot;/&quot;+newFileName);<br></td></tr
><tr
id=sl_svn14_586

 onmouseover="gutterOver(586)"

><td class="source">		if(!file1.exists()){<br></td></tr
><tr
id=sl_svn14_587

 onmouseover="gutterOver(587)"

><td class="source">		System.out.println(&quot;Error!: File &quot;+Path+&quot;/&quot;+srcFileName+&quot; not found.&quot;);	<br></td></tr
><tr
id=sl_svn14_588

 onmouseover="gutterOver(588)"

><td class="source">		}else{<br></td></tr
><tr
id=sl_svn14_589

 onmouseover="gutterOver(589)"

><td class="source">		file1.renameTo(file2);<br></td></tr
><tr
id=sl_svn14_590

 onmouseover="gutterOver(590)"

><td class="source">		System.out.println(&quot;Executed: File &quot;+ &#39;&quot;&#39;+srcFileName+&#39;&quot;&#39;+&quot; succesfully changed to &quot;+&#39;&quot;&#39;+newFileName+&#39;&quot;&#39;+&quot;.&quot;);<br></td></tr
><tr
id=sl_svn14_591

 onmouseover="gutterOver(591)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_592

 onmouseover="gutterOver(592)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_593

 onmouseover="gutterOver(593)"

><td class="source">	<br></td></tr
><tr
id=sl_svn14_594

 onmouseover="gutterOver(594)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_595

 onmouseover="gutterOver(595)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_596

 onmouseover="gutterOver(596)"

><td class="source">	public static class proc{<br></td></tr
><tr
id=sl_svn14_597

 onmouseover="gutterOver(597)"

><td class="source">		/**<br></td></tr
><tr
id=sl_svn14_598

 onmouseover="gutterOver(598)"

><td class="source">		 * Process name: fileBackup<br></td></tr
><tr
id=sl_svn14_599

 onmouseover="gutterOver(599)"

><td class="source">		 * <br></td></tr
><tr
id=sl_svn14_600

 onmouseover="gutterOver(600)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_601

 onmouseover="gutterOver(601)"

><td class="source">		 * Backup the folder to designated destination directory.<br></td></tr
><tr
id=sl_svn14_602

 onmouseover="gutterOver(602)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_603

 onmouseover="gutterOver(603)"

><td class="source">		 * @param folderName Name of folder to be backup.<br></td></tr
><tr
id=sl_svn14_604

 onmouseover="gutterOver(604)"

><td class="source">		 * @param srcDir Source directory.<br></td></tr
><tr
id=sl_svn14_605

 onmouseover="gutterOver(605)"

><td class="source">		 * @param destDir Designated destination directory.<br></td></tr
><tr
id=sl_svn14_606

 onmouseover="gutterOver(606)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_607

 onmouseover="gutterOver(607)"

><td class="source">		 * Example:<br></td></tr
><tr
id=sl_svn14_608

 onmouseover="gutterOver(608)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_609

 onmouseover="gutterOver(609)"

><td class="source">		 * proc.fileBackup(&quot;test1&quot;, &quot;C://test&quot;, &quot;C://test/test&quot;);<br></td></tr
><tr
id=sl_svn14_610

 onmouseover="gutterOver(610)"

><td class="source">		 */<br></td></tr
><tr
id=sl_svn14_611

 onmouseover="gutterOver(611)"

><td class="source">		public static void fileBackup(String folderName, String srcDir, String destDir) throws IOException{<br></td></tr
><tr
id=sl_svn14_612

 onmouseover="gutterOver(612)"

><td class="source">			File destMarker = new File(destDir);<br></td></tr
><tr
id=sl_svn14_613

 onmouseover="gutterOver(613)"

><td class="source">			File newSourceDir = new File(srcDir+&quot;/&quot;+folderName);<br></td></tr
><tr
id=sl_svn14_614

 onmouseover="gutterOver(614)"

><td class="source">			File newDestDir = new File (destDir+&quot;/&quot;+folderName+&quot;_&quot;+function.timestamp());<br></td></tr
><tr
id=sl_svn14_615

 onmouseover="gutterOver(615)"

><td class="source">			if(newSourceDir.isDirectory()){<br></td></tr
><tr
id=sl_svn14_616

 onmouseover="gutterOver(616)"

><td class="source">				System.out.println(&quot;Status: Source directory &quot;+destDir+&quot; existed.&quot;);<br></td></tr
><tr
id=sl_svn14_617

 onmouseover="gutterOver(617)"

><td class="source">			}else{<br></td></tr
><tr
id=sl_svn14_618

 onmouseover="gutterOver(618)"

><td class="source">				System.out.println(&quot;Error!!: Source directory &quot;+newSourceDir+&quot; not found.&quot;);	<br></td></tr
><tr
id=sl_svn14_619

 onmouseover="gutterOver(619)"

><td class="source">				return;<br></td></tr
><tr
id=sl_svn14_620

 onmouseover="gutterOver(620)"

><td class="source">			}<br></td></tr
><tr
id=sl_svn14_621

 onmouseover="gutterOver(621)"

><td class="source">			if(destMarker.isDirectory()){<br></td></tr
><tr
id=sl_svn14_622

 onmouseover="gutterOver(622)"

><td class="source">				System.out.println(&quot;Status: Destination directory &quot;+destMarker+&quot; existed.&quot;);<br></td></tr
><tr
id=sl_svn14_623

 onmouseover="gutterOver(623)"

><td class="source">				System.out.println(&quot;Execution: System backup in progress...&quot;);<br></td></tr
><tr
id=sl_svn14_624

 onmouseover="gutterOver(624)"

><td class="source">				<br></td></tr
><tr
id=sl_svn14_625

 onmouseover="gutterOver(625)"

><td class="source">				function.copyFolderActual(newSourceDir, newDestDir);<br></td></tr
><tr
id=sl_svn14_626

 onmouseover="gutterOver(626)"

><td class="source">				<br></td></tr
><tr
id=sl_svn14_627

 onmouseover="gutterOver(627)"

><td class="source">				System.out.println(&quot;Status: System Backup Successful.&quot;);<br></td></tr
><tr
id=sl_svn14_628

 onmouseover="gutterOver(628)"

><td class="source">			}else{<br></td></tr
><tr
id=sl_svn14_629

 onmouseover="gutterOver(629)"

><td class="source">				System.out.println(&quot;Error!!: Destination directory &quot;+destDir+&quot; not found.&quot;);<br></td></tr
><tr
id=sl_svn14_630

 onmouseover="gutterOver(630)"

><td class="source">				return;<br></td></tr
><tr
id=sl_svn14_631

 onmouseover="gutterOver(631)"

><td class="source">			}<br></td></tr
><tr
id=sl_svn14_632

 onmouseover="gutterOver(632)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_633

 onmouseover="gutterOver(633)"

><td class="source">		/**<br></td></tr
><tr
id=sl_svn14_634

 onmouseover="gutterOver(634)"

><td class="source">		 * Process name: runCL<br></td></tr
><tr
id=sl_svn14_635

 onmouseover="gutterOver(635)"

><td class="source">		 * <br></td></tr
><tr
id=sl_svn14_636

 onmouseover="gutterOver(636)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_637

 onmouseover="gutterOver(637)"

><td class="source">		 * Execute the windows @ unix command line. Process completed when the CL process terminate.<br></td></tr
><tr
id=sl_svn14_638

 onmouseover="gutterOver(638)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_639

 onmouseover="gutterOver(639)"

><td class="source">		 * @param proc Process execution syntax.<br></td></tr
><tr
id=sl_svn14_640

 onmouseover="gutterOver(640)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_641

 onmouseover="gutterOver(641)"

><td class="source">		 * Example:<br></td></tr
><tr
id=sl_svn14_642

 onmouseover="gutterOver(642)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_643

 onmouseover="gutterOver(643)"

><td class="source">		 * proc.runCL(&quot;notepad&quot;);<br></td></tr
><tr
id=sl_svn14_644

 onmouseover="gutterOver(644)"

><td class="source">		 */<br></td></tr
><tr
id=sl_svn14_645

 onmouseover="gutterOver(645)"

><td class="source">		public static void runCL (String proc) throws InterruptedException{<br></td></tr
><tr
id=sl_svn14_646

 onmouseover="gutterOver(646)"

><td class="source">			String writeINFO=null;<br></td></tr
><tr
id=sl_svn14_647

 onmouseover="gutterOver(647)"

><td class="source">			Runtime runtime = Runtime.getRuntime();<br></td></tr
><tr
id=sl_svn14_648

 onmouseover="gutterOver(648)"

><td class="source">			System.out.println(&quot;Execute: Runtime executed.&quot;);<br></td></tr
><tr
id=sl_svn14_649

 onmouseover="gutterOver(649)"

><td class="source">			try {<br></td></tr
><tr
id=sl_svn14_650

 onmouseover="gutterOver(650)"

><td class="source">				Process process = runtime.exec(proc);<br></td></tr
><tr
id=sl_svn14_651

 onmouseover="gutterOver(651)"

><td class="source">				BufferedReader runningINFO = new BufferedReader(new InputStreamReader(process.getInputStream()));<br></td></tr
><tr
id=sl_svn14_652

 onmouseover="gutterOver(652)"

><td class="source"><br></td></tr
><tr
id=sl_svn14_653

 onmouseover="gutterOver(653)"

><td class="source">			    while((writeINFO=runningINFO.readLine()) != null) {<br></td></tr
><tr
id=sl_svn14_654

 onmouseover="gutterOver(654)"

><td class="source">			        System.out.println(writeINFO);<br></td></tr
><tr
id=sl_svn14_655

 onmouseover="gutterOver(655)"

><td class="source">			    }<br></td></tr
><tr
id=sl_svn14_656

 onmouseover="gutterOver(656)"

><td class="source">			    System.out.println(&quot;Info: Runtime execution succeed.&quot;);<br></td></tr
><tr
id=sl_svn14_657

 onmouseover="gutterOver(657)"

><td class="source">			    <br></td></tr
><tr
id=sl_svn14_658

 onmouseover="gutterOver(658)"

><td class="source">				} catch (IOException e) {<br></td></tr
><tr
id=sl_svn14_659

 onmouseover="gutterOver(659)"

><td class="source">					System.out.println(&quot;Error!: Invalid runtime execution&quot;);<br></td></tr
><tr
id=sl_svn14_660

 onmouseover="gutterOver(660)"

><td class="source">					e.printStackTrace();<br></td></tr
><tr
id=sl_svn14_661

 onmouseover="gutterOver(661)"

><td class="source">			}<br></td></tr
><tr
id=sl_svn14_662

 onmouseover="gutterOver(662)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_663

 onmouseover="gutterOver(663)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_664

 onmouseover="gutterOver(664)"

><td class="source">	<br></td></tr
><tr
id=sl_svn14_665

 onmouseover="gutterOver(665)"

><td class="source">	public static class math{<br></td></tr
><tr
id=sl_svn14_666

 onmouseover="gutterOver(666)"

><td class="source">		/** <br></td></tr
><tr
id=sl_svn14_667

 onmouseover="gutterOver(667)"

><td class="source">		 * Math function: Plus<br></td></tr
><tr
id=sl_svn14_668

 onmouseover="gutterOver(668)"

><td class="source">		 * <br></td></tr
><tr
id=sl_svn14_669

 onmouseover="gutterOver(669)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_670

 onmouseover="gutterOver(670)"

><td class="source">		 * Execute plus operation<br></td></tr
><tr
id=sl_svn14_671

 onmouseover="gutterOver(671)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_672

 onmouseover="gutterOver(672)"

><td class="source">		 * @param input x value<br></td></tr
><tr
id=sl_svn14_673

 onmouseover="gutterOver(673)"

><td class="source">		 * @param constant y value<br></td></tr
><tr
id=sl_svn14_674

 onmouseover="gutterOver(674)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_675

 onmouseover="gutterOver(675)"

><td class="source">		 * Example:<br></td></tr
><tr
id=sl_svn14_676

 onmouseover="gutterOver(676)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_677

 onmouseover="gutterOver(677)"

><td class="source">		 * int out = math.plus(10,2);<br></td></tr
><tr
id=sl_svn14_678

 onmouseover="gutterOver(678)"

><td class="source">		 */<br></td></tr
><tr
id=sl_svn14_679

 onmouseover="gutterOver(679)"

><td class="source">		public static int plus (int input, int constant) throws IOException{<br></td></tr
><tr
id=sl_svn14_680

 onmouseover="gutterOver(680)"

><td class="source">			int x = input;<br></td></tr
><tr
id=sl_svn14_681

 onmouseover="gutterOver(681)"

><td class="source">			int y = constant;<br></td></tr
><tr
id=sl_svn14_682

 onmouseover="gutterOver(682)"

><td class="source">			int z = x+y;<br></td></tr
><tr
id=sl_svn14_683

 onmouseover="gutterOver(683)"

><td class="source">			return z;<br></td></tr
><tr
id=sl_svn14_684

 onmouseover="gutterOver(684)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_685

 onmouseover="gutterOver(685)"

><td class="source">		/** <br></td></tr
><tr
id=sl_svn14_686

 onmouseover="gutterOver(686)"

><td class="source">		 * Math function: Minus<br></td></tr
><tr
id=sl_svn14_687

 onmouseover="gutterOver(687)"

><td class="source">		 * <br></td></tr
><tr
id=sl_svn14_688

 onmouseover="gutterOver(688)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_689

 onmouseover="gutterOver(689)"

><td class="source">		 * Execute Minus operation<br></td></tr
><tr
id=sl_svn14_690

 onmouseover="gutterOver(690)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_691

 onmouseover="gutterOver(691)"

><td class="source">		 * @param input x value<br></td></tr
><tr
id=sl_svn14_692

 onmouseover="gutterOver(692)"

><td class="source">		 * @param constant y value<br></td></tr
><tr
id=sl_svn14_693

 onmouseover="gutterOver(693)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_694

 onmouseover="gutterOver(694)"

><td class="source">		 * Example:<br></td></tr
><tr
id=sl_svn14_695

 onmouseover="gutterOver(695)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_696

 onmouseover="gutterOver(696)"

><td class="source">		 * int out = math.minus(10,2);<br></td></tr
><tr
id=sl_svn14_697

 onmouseover="gutterOver(697)"

><td class="source">		 */<br></td></tr
><tr
id=sl_svn14_698

 onmouseover="gutterOver(698)"

><td class="source">		public static int minus (int input, int constant) throws IOException{<br></td></tr
><tr
id=sl_svn14_699

 onmouseover="gutterOver(699)"

><td class="source">			int x = input;<br></td></tr
><tr
id=sl_svn14_700

 onmouseover="gutterOver(700)"

><td class="source">			int y = constant;<br></td></tr
><tr
id=sl_svn14_701

 onmouseover="gutterOver(701)"

><td class="source">			int z = x-y;<br></td></tr
><tr
id=sl_svn14_702

 onmouseover="gutterOver(702)"

><td class="source">			return z;<br></td></tr
><tr
id=sl_svn14_703

 onmouseover="gutterOver(703)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_704

 onmouseover="gutterOver(704)"

><td class="source">		/** <br></td></tr
><tr
id=sl_svn14_705

 onmouseover="gutterOver(705)"

><td class="source">		 * Math function: Multiple<br></td></tr
><tr
id=sl_svn14_706

 onmouseover="gutterOver(706)"

><td class="source">		 * <br></td></tr
><tr
id=sl_svn14_707

 onmouseover="gutterOver(707)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_708

 onmouseover="gutterOver(708)"

><td class="source">		 * Execute Multiple operation<br></td></tr
><tr
id=sl_svn14_709

 onmouseover="gutterOver(709)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_710

 onmouseover="gutterOver(710)"

><td class="source">		 * @param input x value<br></td></tr
><tr
id=sl_svn14_711

 onmouseover="gutterOver(711)"

><td class="source">		 * @param constant y value<br></td></tr
><tr
id=sl_svn14_712

 onmouseover="gutterOver(712)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_713

 onmouseover="gutterOver(713)"

><td class="source">		 * Example:<br></td></tr
><tr
id=sl_svn14_714

 onmouseover="gutterOver(714)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_715

 onmouseover="gutterOver(715)"

><td class="source">		 * int out = math.multiple(10,2);<br></td></tr
><tr
id=sl_svn14_716

 onmouseover="gutterOver(716)"

><td class="source">		 */<br></td></tr
><tr
id=sl_svn14_717

 onmouseover="gutterOver(717)"

><td class="source">		public static int multiple (int input, int constant) throws IOException{<br></td></tr
><tr
id=sl_svn14_718

 onmouseover="gutterOver(718)"

><td class="source">			int x = input;<br></td></tr
><tr
id=sl_svn14_719

 onmouseover="gutterOver(719)"

><td class="source">			int y = constant;<br></td></tr
><tr
id=sl_svn14_720

 onmouseover="gutterOver(720)"

><td class="source">			int z = x*y;<br></td></tr
><tr
id=sl_svn14_721

 onmouseover="gutterOver(721)"

><td class="source">			return z;<br></td></tr
><tr
id=sl_svn14_722

 onmouseover="gutterOver(722)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_723

 onmouseover="gutterOver(723)"

><td class="source">		/** <br></td></tr
><tr
id=sl_svn14_724

 onmouseover="gutterOver(724)"

><td class="source">		 * Math function: Divide<br></td></tr
><tr
id=sl_svn14_725

 onmouseover="gutterOver(725)"

><td class="source">		 * <br></td></tr
><tr
id=sl_svn14_726

 onmouseover="gutterOver(726)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_727

 onmouseover="gutterOver(727)"

><td class="source">		 * Execute Divide operation<br></td></tr
><tr
id=sl_svn14_728

 onmouseover="gutterOver(728)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_729

 onmouseover="gutterOver(729)"

><td class="source">		 * @param input x value<br></td></tr
><tr
id=sl_svn14_730

 onmouseover="gutterOver(730)"

><td class="source">		 * @param constant y value<br></td></tr
><tr
id=sl_svn14_731

 onmouseover="gutterOver(731)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_732

 onmouseover="gutterOver(732)"

><td class="source">		 * Example:<br></td></tr
><tr
id=sl_svn14_733

 onmouseover="gutterOver(733)"

><td class="source">		 * &lt;p&gt;<br></td></tr
><tr
id=sl_svn14_734

 onmouseover="gutterOver(734)"

><td class="source">		 * int out = math.divide(10,2);<br></td></tr
><tr
id=sl_svn14_735

 onmouseover="gutterOver(735)"

><td class="source">		 */<br></td></tr
><tr
id=sl_svn14_736

 onmouseover="gutterOver(736)"

><td class="source">		public static int divide (int input, int constant) throws IOException{<br></td></tr
><tr
id=sl_svn14_737

 onmouseover="gutterOver(737)"

><td class="source">			int x = input;<br></td></tr
><tr
id=sl_svn14_738

 onmouseover="gutterOver(738)"

><td class="source">			int y = constant;<br></td></tr
><tr
id=sl_svn14_739

 onmouseover="gutterOver(739)"

><td class="source">			int z = x/y;<br></td></tr
><tr
id=sl_svn14_740

 onmouseover="gutterOver(740)"

><td class="source">			return z;<br></td></tr
><tr
id=sl_svn14_741

 onmouseover="gutterOver(741)"

><td class="source">		}<br></td></tr
><tr
id=sl_svn14_742

 onmouseover="gutterOver(742)"

><td class="source">		<br></td></tr
><tr
id=sl_svn14_743

 onmouseover="gutterOver(743)"

><td class="source">	}<br></td></tr
><tr
id=sl_svn14_744

 onmouseover="gutterOver(744)"

><td class="source">	<br></td></tr
><tr
id=sl_svn14_745

 onmouseover="gutterOver(745)"

><td class="source">	<br></td></tr
><tr
id=sl_svn14_746

 onmouseover="gutterOver(746)"

><td class="source">	<br></td></tr
><tr
id=sl_svn14_747

 onmouseover="gutterOver(747)"

><td class="source">}<br></td></tr
></table></pre>
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
</td>
</tr></table>

 
<script type="text/javascript">
 var lineNumUnderMouse = -1;
 
 function gutterOver(num) {
 gutterOut();
 var newTR = document.getElementById('gr_svn14_' + num);
 if (newTR) {
 newTR.className = 'undermouse';
 }
 lineNumUnderMouse = num;
 }
 function gutterOut() {
 if (lineNumUnderMouse != -1) {
 var oldTR = document.getElementById(
 'gr_svn14_' + lineNumUnderMouse);
 if (oldTR) {
 oldTR.className = '';
 }
 lineNumUnderMouse = -1;
 }
 }
 var numsGenState = {table_base_id: 'nums_table_'};
 var srcGenState = {table_base_id: 'src_table_'};
 var alignerRunning = false;
 var startOver = false;
 function setLineNumberHeights() {
 if (alignerRunning) {
 startOver = true;
 return;
 }
 numsGenState.chunk_id = 0;
 numsGenState.table = document.getElementById('nums_table_0');
 numsGenState.row_num = 0;
 if (!numsGenState.table) {
 return; // Silently exit if no file is present.
 }
 srcGenState.chunk_id = 0;
 srcGenState.table = document.getElementById('src_table_0');
 srcGenState.row_num = 0;
 alignerRunning = true;
 continueToSetLineNumberHeights();
 }
 function rowGenerator(genState) {
 if (genState.row_num < genState.table.rows.length) {
 var currentRow = genState.table.rows[genState.row_num];
 genState.row_num++;
 return currentRow;
 }
 var newTable = document.getElementById(
 genState.table_base_id + (genState.chunk_id + 1));
 if (newTable) {
 genState.chunk_id++;
 genState.row_num = 0;
 genState.table = newTable;
 return genState.table.rows[0];
 }
 return null;
 }
 var MAX_ROWS_PER_PASS = 1000;
 function continueToSetLineNumberHeights() {
 var rowsInThisPass = 0;
 var numRow = 1;
 var srcRow = 1;
 while (numRow && srcRow && rowsInThisPass < MAX_ROWS_PER_PASS) {
 numRow = rowGenerator(numsGenState);
 srcRow = rowGenerator(srcGenState);
 rowsInThisPass++;
 if (numRow && srcRow) {
 if (numRow.offsetHeight != srcRow.offsetHeight) {
 numRow.firstChild.style.height = srcRow.offsetHeight + 'px';
 }
 }
 }
 if (rowsInThisPass >= MAX_ROWS_PER_PASS) {
 setTimeout(continueToSetLineNumberHeights, 10);
 } else {
 alignerRunning = false;
 if (startOver) {
 startOver = false;
 setTimeout(setLineNumberHeights, 500);
 }
 }
 }
 function initLineNumberHeights() {
 // Do 2 complete passes, because there can be races
 // between this code and prettify.
 startOver = true;
 setTimeout(setLineNumberHeights, 250);
 window.onresize = setLineNumberHeights;
 }
 initLineNumberHeights();
</script>

 
 
 <div id="log">
 <div style="text-align:right">
 <a class="ifCollapse" href="#" onclick="_toggleMeta(this); return false">Show details</a>
 <a class="ifExpand" href="#" onclick="_toggleMeta(this); return false">Hide details</a>
 </div>
 <div class="ifExpand">
 
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="changelog">
 <p>Change log</p>
 <div>
 <a href="/p/gravity-jio/source/detail?spec=svn14&amp;r=2">r2</a>
 by gravitydevelopment@gmail.com
 on Sep 16, 2013
 &nbsp; <a href="/p/gravity-jio/source/diff?spec=svn14&r=2&amp;format=side&amp;path=/src/gravity/jioLib.java&amp;old_path=/src/gravity/jioLib.java&amp;old=">Diff</a>
 </div>
 <pre>Add source</pre>
 </div>
 
 
 
 
 
 
 <script type="text/javascript">
 var detail_url = '/p/gravity-jio/source/detail?r=2&spec=svn14';
 var publish_url = '/p/gravity-jio/source/detail?r=2&spec=svn14#publish';
 // describe the paths of this revision in javascript.
 var changed_paths = [];
 var changed_urls = [];
 
 changed_paths.push('/src');
 changed_urls.push('/p/gravity-jio/source/browse/src?r\x3d2\x26spec\x3dsvn14');
 
 
 changed_paths.push('/src/gravity');
 changed_urls.push('/p/gravity-jio/source/browse/src/gravity?r\x3d2\x26spec\x3dsvn14');
 
 
 changed_paths.push('/src/gravity/jioLib.java');
 changed_urls.push('/p/gravity-jio/source/browse/src/gravity/jioLib.java?r\x3d2\x26spec\x3dsvn14');
 
 var selected_path = '/src/gravity/jioLib.java';
 
 
 function getCurrentPageIndex() {
 for (var i = 0; i < changed_paths.length; i++) {
 if (selected_path == changed_paths[i]) {
 return i;
 }
 }
 }
 function getNextPage() {
 var i = getCurrentPageIndex();
 if (i < changed_paths.length - 1) {
 return changed_urls[i + 1];
 }
 return null;
 }
 function getPreviousPage() {
 var i = getCurrentPageIndex();
 if (i > 0) {
 return changed_urls[i - 1];
 }
 return null;
 }
 function gotoNextPage() {
 var page = getNextPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoPreviousPage() {
 var page = getPreviousPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoDetailPage() {
 window.location = detail_url;
 }
 function gotoPublishPage() {
 window.location = publish_url;
 }
</script>

 
 <style type="text/css">
 #review_nav {
 border-top: 3px solid white;
 padding-top: 6px;
 margin-top: 1em;
 }
 #review_nav td {
 vertical-align: middle;
 }
 #review_nav select {
 margin: .5em 0;
 }
 </style>
 <div id="review_nav">
 <table><tr><td>Go to:&nbsp;</td><td>
 <select name="files_in_rev" onchange="window.location=this.value">
 
 <option value="/p/gravity-jio/source/browse/src?r=2&amp;spec=svn14"
 
 >/src</option>
 
 <option value="/p/gravity-jio/source/browse/src/gravity?r=2&amp;spec=svn14"
 
 >/src/gravity</option>
 
 <option value="/p/gravity-jio/source/browse/src/gravity/jioLib.java?r=2&amp;spec=svn14"
 selected="selected"
 >/src/gravity/jioLib.java</option>
 
 </select>
 </td></tr></table>
 
 
 <div id="review_instr" class="closed">
 <a class="ifOpened" href="/p/gravity-jio/source/detail?r=2&spec=svn14#publish">Publish your comments</a>
 <div class="ifClosed">Double click a line to add a comment</div>
 </div>
 
 </div>
 
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="older_bubble">
 <p>Older revisions</p>
 
 <a href="/p/gravity-jio/source/list?path=/src/gravity/jioLib.java&start=2">All revisions of this file</a>
 </div>
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="fileinfo_bubble">
 <p>File info</p>
 
 <div>Size: 22782 bytes,
 747 lines</div>
 
 <div><a href="//gravity-jio.googlecode.com/svn/src/gravity/jioLib.java">View raw file</a></div>
 </div>
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 </div>
 </div>


</div>

</div>
</div>

<script src="https://ssl.gstatic.com/codesite/ph/15490321151412058579/js/prettify/prettify.js"></script>
<script type="text/javascript">prettyPrint();</script>


<script src="https://ssl.gstatic.com/codesite/ph/15490321151412058579/js/source_file_scripts.js"></script>

 <script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/15490321151412058579/js/kibbles.js"></script>
 <script type="text/javascript">
 var lastStop = null;
 var initialized = false;
 
 function updateCursor(next, prev) {
 if (prev && prev.element) {
 prev.element.className = 'cursor_stop cursor_hidden';
 }
 if (next && next.element) {
 next.element.className = 'cursor_stop cursor';
 lastStop = next.index;
 }
 }
 
 function pubRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftDestroyed(data) {
 updateCursorForCell(data.cellId, 'nocursor');
 if (initialized) {
 reloadCursors();
 }
 }
 function reloadCursors() {
 kibbles.skipper.reset();
 loadCursors();
 if (lastStop != null) {
 kibbles.skipper.setCurrentStop(lastStop);
 }
 }
 // possibly the simplest way to insert any newly added comments
 // is to update the class of the corresponding cursor row,
 // then refresh the entire list of rows.
 function updateCursorForCell(cellId, className) {
 var cell = document.getElementById(cellId);
 // we have to go two rows back to find the cursor location
 var row = getPreviousElement(cell.parentNode);
 row.className = className;
 }
 // returns the previous element, ignores text nodes.
 function getPreviousElement(e) {
 var element = e.previousSibling;
 if (element.nodeType == 3) {
 element = element.previousSibling;
 }
 if (element && element.tagName) {
 return element;
 }
 }
 function loadCursors() {
 // register our elements with skipper
 var elements = CR_getElements('*', 'cursor_stop');
 var len = elements.length;
 for (var i = 0; i < len; i++) {
 var element = elements[i]; 
 element.className = 'cursor_stop cursor_hidden';
 kibbles.skipper.append(element);
 }
 }
 function toggleComments() {
 CR_toggleCommentDisplay();
 reloadCursors();
 }
 function keysOnLoadHandler() {
 // setup skipper
 kibbles.skipper.addStopListener(
 kibbles.skipper.LISTENER_TYPE.PRE, updateCursor);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_top', 50);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_bottom', 100);
 // Register our keys
 kibbles.skipper.addFwdKey("n");
 kibbles.skipper.addRevKey("p");
 kibbles.keys.addKeyPressListener(
 'u', function() { window.location = detail_url; });
 kibbles.keys.addKeyPressListener(
 'r', function() { window.location = detail_url + '#publish'; });
 
 kibbles.keys.addKeyPressListener('j', gotoNextPage);
 kibbles.keys.addKeyPressListener('k', gotoPreviousPage);
 
 
 kibbles.keys.addKeyPressListener('h', toggleComments);
 
 }
 </script>
<script src="https://ssl.gstatic.com/codesite/ph/15490321151412058579/js/code_review_scripts.js"></script>
<script type="text/javascript">
 function showPublishInstructions() {
 var element = document.getElementById('review_instr');
 if (element) {
 element.className = 'opened';
 }
 }
 var codereviews;
 function revsOnLoadHandler() {
 // register our source container with the commenting code
 var paths = {'svn14': '/src/gravity/jioLib.java'}
 codereviews = CR_controller.setup(
 {"token":"Xgkj5kVxZxgmT0gmVd8iD_Iar-c:1380473672537","profileUrl":"/u/gravitydevelopment/","domainName":null,"assetHostPath":"https://ssl.gstatic.com/codesite/ph","projectHomeUrl":"/p/gravity-jio","assetVersionPath":"https://ssl.gstatic.com/codesite/ph/15490321151412058579","loggedInUserEmail":"gravitydevelopment@gmail.com","projectName":"gravity-jio","relativeBaseUrl":""}, '', 'svn14', paths,
 CR_BrowseIntegrationFactory);
 
 // register our source container with the commenting code
 // in this case we're registering the container and the revison
 // associated with the contianer which may be the primary revision
 // or may be a previous revision against which the primary revision
 // of the file is being compared.
 codereviews.registerSourceContainer(document.getElementById('lines'), 'svn14');
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, showPublishInstructions);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_PUB_PLATE, pubRevealed);
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, draftRevealed);
 codereviews.registerActivityListener(CR_ActivityType.DISCARD_DRAFT_COMMENT, draftDestroyed);
 
 
 
 
 
 
 
 var initialized = true;
 reloadCursors();
 }
 window.onload = function() {keysOnLoadHandler(); revsOnLoadHandler();};

</script>
<script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/15490321151412058579/js/dit_scripts.js"></script>

 
 
 
 <script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/15490321151412058579/js/ph_core.js"></script>
 
 
 
 
</div> 

<div id="footer" dir="ltr">
 <div class="text">
 <a href="/projecthosting/terms.html">Terms</a> -
 <a href="http://www.google.com/privacy.html">Privacy</a> -
 <a href="/p/support/">Project Hosting Help</a>
 </div>
</div>
 <div class="hostedBy" style="margin-top: -20px;">
 <span style="vertical-align: top;">Powered by <a href="http://code.google.com/projecthosting/">Google Project Hosting</a></span>
 </div>

 
 


 
 </body>
</html>

