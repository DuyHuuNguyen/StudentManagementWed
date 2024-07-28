<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang ??ng ký</title>
    <link rel="stylesheet" href="dangKy.CSS">
</head>
<body>
    <div class="container"  >
        <h2>T?o tài kho?n </h2>
        <form >
            <div class="form-group">
                <div class="left-side">
                  
                    <from action="http://localhost:8080/Web/create" method="post"> 
                        <label for="hoTen">Full name</label>
                        <input type="text" id="hoTen" name="name" required>

                        <label for="diaChi">Address</label>
                        <input type="text" id="diaChi" name="address" required>



                        <label for="ngaySinh">Day Of Birth</label>
                        <input type="date" id="ngaySinh" name="dayOfBirth" required>

                        <label for="queQuan">Home Town</label>
                        <input type="text" id="queQuan" name="homeTown" required >
                    </from>
                </div>

                <div class="right-side">
                    <label for="sdt">PhoneNumber</label>
                    <input type="tel" id="sdt" name="phoneNumber" required>

                    <label for="trinhDo">Level</label>
                    <input type="text" id="trinhDo" name="level" required>

                    <label for="accountId">AccountId</label>
                    <input type="text" id="accountId" name="accountId" required>

                    <label for="pass">Password</label>
                    <input type="password" id="pass" name="pass" required>
                </div>
            </div>
            <button type="submit"> Create</button>
        </form>
    </div>
</body>
</html>
