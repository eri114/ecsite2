<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>userInfo画面</title>

	<style type="text/css">
	/*========TAG LAYOUT========*/
		body {
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana, Helvetica, sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}
		/*========ID LAYOUT========*/
		#top {
			width:780px;
			margin:30px auto;
			border:1px solid #333;
		}

		#header {
			width:100%;
			height:80px;
			background-color:black;
		}

		#main {
			width:100%;
			height:500px;
			text-align:center;
		}

		#footer {
			width:100%;
			height:80px;
			background-color:black;
			clear:both;
		}

		#text-right {
			display:inline-block;
			text-align:right;
			}

	</style>

</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>userInfo</p>
		</div>
								<%-- actionファイルは後で変更する!! --%>
		<div>
			<h3>登録情報は以下の通りです。</h3>
		<table>
			<s:form action="UserCreateAction">
			<tr id="box">
				<td>
					<label>ログインID(ユーザー名)</label>
					</td>
					<td>
						<s:property value="loginUserId" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<label>ログインPASS</label>
					</td>
					<td>
						<s:property value="loginPassword" escape="false" />
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>氏名</label>
					</td>
					<td>
						<s:property value="userName1" escape="false" />
						<s:property value="userName2" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<label>住所</label><br>
					</td>
				<tr>
					<td>
						<label>〒</label>
					</td>
					<td>
						<s:property value="userAddress1" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<label>都道府県</label>
					</td>
					<td>
						<s:property value="userAddress2" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<label>市区町村</label>
					</td>
					<td>
						<s:property value="userAddress3" escape="false" />
				</tr>
				<tr>
					<td>
						<label>番地、マンション名</label>
					</td>
					<td>
						<s:property value="userAddress4" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<label>性別</label>
					</td>
				</tr>
				<tr>
					<td>
						<s:property value="sex" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<label>メールアドレス</label>
					</td>
					<td>
						<s:property value="mail" escape="false" />
					</td>
				</tr>
				<tr>
					<td>
						<label>電話番号</label>
					</td>
					<td>
						<s:property value="tel" escape="false" />
					</td>
				</tr>

			</s:form>
		</table>

		</div>
			<div id="text-right">
				<s:form action="GoHomeAction">
					<s:submit value="Home"/>
				</s:form>
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</div>>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>