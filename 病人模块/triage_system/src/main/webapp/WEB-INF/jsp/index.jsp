<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
<title>预约首页 </title>
<link href="../../statics/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../../statics/js/jquery-1.11.1.min.js"></script>
<script src="../../statics/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="../../statics/css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<script src="../../statics/js/jquery.easydropdown.js"></script>
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
<script type="text/javascript" src="../../statics/js/move-top.js"></script>
<script type="text/javascript" src="../../statics/js/easing.js"></script>
<style type="text/css">
	.logo h1{
		font-weight: bolder;
		margin-left: 10px;
		margin-bottom: 10px;
	}
</style>
</head>
<body>

<div class="header">
   <div class="header_top">	
      <div class="container-fluid"> 
             <div class="logo">
				<h1><a href="#">分诊系统首页</a></h1>
			 </div>
			 <nav class="navbar navbar-default menu" role="navigation"><h3 class="nav_right"><a href="index.jsp"><h1><a href="index.jsp">Drug Expo</a></h1></a></h3>
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			    </div>
				<!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav menu1">
			      	<!--<li class="active"><a href="#home" class="scroll"> <span> </span><i class="menu-border"></i></a></li>-->
			        <li><a href="#about" class="scroll">关于我们</a></li>
			        <li><a href="#benefit" class='scroll'>医院风景</a></li>

			        <li><a href="${pageContext.request.contextPath }/registrationAdd.html">预约挂号</a></li>
			       </ul>
			    </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
            <div class="clearfix"></div>
		 </div>  
	   </div>
	   <div class="header_bottom">
	     <div class="index-banner" id="home">
       	   <div class="wmuSlider example1">
			   <div class="wmuSliderWrapper">
				   <article style="position: absolute; width: 100%; opacity: 0;"> 
				   	<div class="banner-wrap">
				   	   <div class="slider-left">
				   		   <div class="slider_wrap">
						    <h1>温馨提示</h1>
						    <p>本网页主要用来介绍本院特色，有风景，专家介绍，抗疫英雄（所有内容纯属虚构！！！）
							患者在预约的时候会有一个验证，当你之前没有在本院挂号过得病人会先让您填写基本信息在预约挂号。
								患者也可以通过本网站查医生对自己的诊断情况！</p>
						   </div>  

						 </div>
						 <ul class="social">

	    				 </ul>
					     <div class="clearfix"></div>
					 </div>
					</article>
				    <article style="position: relative; width: 100%; opacity: 1;"> 
				   	<div class="banner-wrap">
				   	   <div class="slider-left">
				   		   <div class="slider_wrap">
						    <h1>来预约挂号吧</h1>
						    <p>为了提供各位患者方便，节省时间，本院提供了网站预约挂号服务 </p>
						   </div>  
						 <ul class="banner_login">
				   		 	<li><a href="${pageContext.request.contextPath }/registrationAdd.html">预约挂号</a></li>

				   		  </ul>
						 </div>
						<ul class="social">

	    				 </ul>
					     <div class="clearfix"></div>
					 </div>
				   </article>



				   <article style="position: relative; width: 100%; opacity: 1;">
					   <div class="banner-wrap">
						   <div class="slider-left">
							   <div class="slider_wrap">
								   <h1>查看病历</h1>

							   </div>
							   <ul class="banner_login">
								   <li><a href="${pageContext.request.contextPath }/quarry.html">点此查询病历</a></li>

							   </ul>
						   </div>
						   <ul class="social">

						   </ul>
						   <div class="clearfix"></div>
					   </div>
				   </article>



				 </div>
				<a class="wmuSliderPrev">Previous</a><a class="wmuSliderNext">Next</a>
            </div>
            <script src="../../statics/js/jquery.wmuSlider.js"></script>
			  <script>
       			$('.example1').wmuSlider();         
   		     </script> 	           	      
      </div>
     </div> 
     <div class="container-fluid">
      	<div class="benefit_icons text-center" id="benefit">
      		<div class="col-md-3 grid_1">
      			<i class="icon1"> </i>
      			<h3>社区</h3>
      			<p>国家现在在大力发展社区医疗服务体制，让小病能够在家门口就能解决掉，大大的缓解了就医压力和大医院的医疗服务能力压力。</p>
      		</div>
      		<div class="col-md-3 grid_1">
      			<i class="icon2"> </i>
      			<h3>建议</h3>
      			<p>欢迎大家给本院提意见！</p>
      		</div>
      		<div class="col-md-3 grid_1">
      			<i class="icon3"> </i>
      			<h3>当你有疑惑?</h3>
      			<p>本院有很多服务站点，为您解决烦恼</p>
      		</div>
      		<div class="col-md-3 grid_1">
      			<i class="icon4"> </i>
      			<h3>24小时提供服务</h3>
      			<p>本院采用24小时服务制度</p>
      		</div>
      		<div class="clearfix"> </div>
      	</div>
      </div>
     </div>
	 <div class="course_demo">
	    <div class="container">
		          <ul id="flexiselDemo3">	
					<li><img src="../../statics/images/1.jpg"  class="img-responsive" alt=""/>
						<div class="content_desc">
							<p>  </p>
						</div>
					</li>
					<li><img src="../../statics/images/2.jpg" class="img-responsive" alt=""/>
						<div class="content_desc">
							<p>  </p>
						</div>
					</li>
					<li><img src="../../statics/images/4.jpg" class="img-responsive" alt=""/>
					  <div class="content_desc">
						  <p>  </p>
					  </div>
				  </li>

					  <li><img src="../../statics/images/5.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/6.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/7.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/8.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/9.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/10.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/11.jpg" class="img-responsive" alt=""/>
					  <div class="content_desc">
						  <p>  </p>
					  </div>
				  </li>
					  <li><img src="../../statics/images/12.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/13.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>
					  <li><img src="../../statics/images/14.jpg" class="img-responsive" alt=""/>
						  <div class="content_desc">
							  <p>  </p>
						  </div>
					  </li>



				 </ul>
				<script type="text/javascript">
			$(window).load(function() {
				$("#flexiselDemo3").flexisel({
					visibleItems: 4,
					animationSpeed: 1000,
					autoPlay: true,
					autoPlaySpeed: 3000,    		
					pauseOnHover: true,
					enableResponsiveBreakpoints: true,
			    	responsiveBreakpoints: { 
			    		portrait: { 
			    			changePoint:480,
			    			visibleItems: 1
			    		}, 
			    		landscape: { 
			    			changePoint:640,
			    			visibleItems: 2
			    		},
			    		tablet: { 
			    			changePoint:768,
			    			visibleItems: 2
			    		}
			    	}
			    });
			    
			});
		</script>
		<script type="text/javascript" src="../../statics/js/jquery.flexisel.js"></script>
	  </div>
   </div>
<hr>
   <div class="about" id="about">
   	  <div class="container">
   	  	<h2>我们的原则</h2>
   	  	<div class="col-md-3 grid_3">
   	  		<i class="about_icon1"> </i>
   	  		<div class="about_desc"> 
   	  		  <h3></h3>
   	  		  <p class="principle">耐心</p>
   	  		</div>
   	  	</div>
   	  	<div class="col-md-3 grid_3">
   	  		<i class="about_icon2"> </i>
   	  		<div class="about_desc"> 
   	  		  <h3></h3>
   	  		  <h3></h3>
   	  		   <p class="principle">专业</p>
   	  		</div>
   	  	</div>
   	  	<div class="col-md-3 grid_3">
   	  		<i class="about_icon3"> </i>
   	  		<div class="about_desc"> 
   	  		  <h3></h3>
   	  		  <p class="principle">负责</p>
   	  		</div>
   	  	</div>
   	  	<div class="col-md-3 grid_3">
   	  		<i class="about_icon4"> </i>
   	  		<div class="about_desc"> 
   	  		  <h3></h3>
   	  		   <p class="principle">有爱心</p>
   	  		</div>
   	  	</div>
   	  </div>
   </div>
   <div class="footer">

   </div>
</body>
</html>		