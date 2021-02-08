<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<title>Music Store</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
			<div class="container">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
				</ul>
				<ul class="navbar-nav">
					<c:if test="${role == null}">
						<li class="nav-item"><a class="nav-link" href="/login">Login</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="/register">Register</a>
						</li>
					</c:if>
					<c:if test="${role == 'USER'}">
						<li class="nav-item"><a class="nav-link" href="/">Welcome
								${name }</a></li>
						<li class="nav-item"><a class="nav-link" href="/logout">Logout</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="/user/userpage">UserPage</a>
						</li>
					</c:if>
					<c:if test="${role == 'ADMIN'}">
						<li class="nav-item"><a class="nav-link" href="/">Welcome
								${name }</a></li>
						<li class="nav-item"><a class="nav-link" href="/logout">Logout</a>
						</li>
						<li class="nav-item"><a class="nav-link"
							href="/admin/adminpage">AdminPage</a></li>
					</c:if>
				</ul>
			</div>
		</nav>
	</header>

Home from jsp

</body>

</html>