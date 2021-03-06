<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>UserCreate画面</title>

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

	</style>


</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>
		<div>
			<s:if test="errorMessage !=''">
				<s:property value="errorMessage" escape="false" />
			</s:if>
			<table>
			<s:form action="UserCreateConfirmAction">
				<tr>
					<td>
						<label>ログインID(ユーザー名)</label>
					</td>
					<td>
						<input type="text" name="loginUserId" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>ログインPASS</label>
					</td>
					<td>
						<input type="password" name="loginPassword" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>氏名</label>
					</td>
					<td>
						<input type="text" name="userName1" size="5" value="" />
						<input type="text" name="userName2" size="5" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>住所</label><br>
					</td>
				</tr>
				<tr>
					<td>
						<label>〒</label>
					</td>
					<td>
						<input type="text" name="userAddress1" value="" />
					<td>
				</tr>
				<tr>
					<td>
						<label>都道府県</label>
					</td>
					<td>
						<select name = "userAddress2">
							<option value ="1" selected="selected">北海道</option>
							<option value="2">青森県</option>
							<option value="3">岩手県</option>
							<option value="4">宮城県</option>
							<option value="5">秋田県</option>
							<option value="6">山形県</option>
							<option value="7">福島県</option>
							<option value="8">茨城県</option>
							<option value="9">栃木県</option>
							<option value="10">群馬県</option>
							<option value="11">埼玉県</option>
							<option value="12">千葉県</option>
							<option value="13">東京都</option>
							<option value="14">神奈川県</option>
							<option value="15">新潟県</option>
							<option value="16">富山県</option>
							<option value="17">石川県</option>
							<option value="18">福井県</option>
							<option value="19">山梨県</option>
							<option value="20">長野県</option>
							<option value="21">岐阜県</option>
							<option value="22">静岡県</option>
							<option value="23">愛知県</option>
							<option value="24">三重県</option>
							<option value="25">滋賀県</option>
							<option value="26">京都府</option>
							<option value="27">大阪府</option>
							<option value="28">兵庫県</option>
							<option value="29">奈良県</option>
							<option value="30">和歌山県</option>
							<option value="31">鳥取県</option>
							<option value="32">島根県</option>
							<option value="33">岡山県</option>
							<option value="34">広島県</option>
							<option value="35">山口県</option>
							<option value="36">徳島県</option>
							<option value="37">香川県</option>
							<option value="38">愛媛県</option>
							<option value="39">高知県</option>
							<option value="40">福岡県</option>
							<option value="41">佐賀県</option>
							<option value="42">長崎県</option>
							<option value="43">熊本県</option>
							<option value="44">大分県</option>
							<option value="45">宮崎県</option>
							<option value="46">鹿児島県</option>
							<option value="47">沖縄県</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<label>市区町村</label>
					</td>
					<td>
						<input type="text" name="userAddress3" value="" />
				</tr>
				<tr>
					<td>
						<label>番地、マンション名</label>
					</td>
					<td>
						<input type="text" name="userAddress4" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>性別</label>
						<label><input type="radio" name="sex" value="男" checked="checked">男</label>
						<label><input type="radio" name="sex" value="女">女</label>
					</td>
				</tr>
				<tr>
					<td>
						<label>メールアドレス</label>
					</td>
					<td>
						<input type="email" name="mail" placeholder="info@example.com">
					</td>
				</tr>
				<tr>
					<td>
						<label>電話番号</label>
					</td>
					<td>
						<input type="text" name="tel" placeholder="090-1234-5678">
					</td>
				</tr>

				<s:submit value="登録"/>
			</s:form>
			</table>
			<div>
				<span>前画面に戻る場合は</span>
				<a href='<s:url action="HomeAction" />'>こちら</a>

			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>