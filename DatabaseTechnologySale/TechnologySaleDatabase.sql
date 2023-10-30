# Tạo bảng thông tin User đăng nhập
create table NguoiDung(
Id int auto_increment primary key,
TenDangNhap varchar(50),
MatKhau varchar(50),
HoTen varchar(50),
DienThoai varchar(50),
Email varchar(50),
DiaChi varchar(150)
);

# Thêm thông tin người dùng
insert into NguoiDung(TenDangNhap, MatKhau, HoTen) values('admin','123','Quản trị hệ thống');
insert into NguoiDung(TenDangNhap, MatKhau, HoTen) values('anhchv','09091996','Cao Hồng Vân Anh');

select * from NguoiDung;


#Tạo bảng Product lưu thông tin các sản phẩm 
Create table SanPham
(
MaSP varchar(10) unique primary key,
TenSP varchar(150),
NhaSanXuat varchar(150),
CauHinh varchar(500),
AnhSP varchar(100),
GiaSP float,
NgayTao date,
NgayCapNhat date,
MaLoaiSP varchar(10),
SoLuong int
);

# Tạo bảng Product Type lưu thông tin các mã loại sản phẩm
Create table LoaiSanPham
(
MaLoaiSPId varchar(10) primary key,
TenLoaiSanPham varchar(150)
);

# Tạo quan hệ
Alter table SanPham
add constraint FK_ProductType foreign key(MaLoaiSP)
references LoaiSanPham(MaLoaiSPId);


# Thêm thông tin Loai sản phẩm
Insert into LoaiSanPham values('DT', 'Điện Thoại');
Insert into LoaiSanPham values('LT', 'Laptop');
Insert into LoaiSanPham values('SW','SmartWatch');

select * from LoaiSanPham;


# Thêm thông tin Sản phẩm
Insert into SanPham(MaSP, TenSP, NhaSanXuat, CauHinh, AnhSP, GiaSP, NgayTao, NgayCapNhat, MaLoaiSP, SoLuong) 
values('SP0001', 'Iphone 15 ProMax 1TB', 'Apple', 'Chip Apple A17 Pro 6 nhân, RAM 8GB, Dung lượng 1TB, Camera trước 12MB', 'iphone15.jpg', 46990000, sysdate(), sysdate(), 'DT', 10 );
Insert into SanPham(MaSP, TenSP, NhaSanXuat, CauHinh, AnhSP, GiaSP, NgayTao, NgayCapNhat, MaLoaiSP, SoLuong) 
values('SP0002', 'Iphone 15 ProMax 512GB', 'Apple', 'Chip Apple A17 Pro 6 nhân, RAM 8GB, Dung lượng 512GB, Camera trước 12MB', 'iphone152.jpg', 46990000, sysdate(), sysdate(), 'DT', 5);
Insert into SanPham(MaSP, TenSP, NhaSanXuat, CauHinh, AnhSP, GiaSP, NgayTao, NgayCapNhat, MaLoaiSP, SoLuong) 
values('SP0003', 'Xiaomi 13T 5G', 'Xiaomi', 'Ram 8GB, Dung lượng 256GB', 'xiaomi.jpg', 11990000, sysdate(), sysdate(), 'DT', 3 );
Insert into SanPham(MaSP, TenSP, NhaSanXuat, CauHinh, AnhSP, GiaSP, NgayTao, NgayCapNhat, MaLoaiSP, SoLuong) 
values('SP0004', 'Macbook Air 13 inch', 'Apple', 'Màn hình 13.3 inch, CPU Apple M1, Card 7 nhân CPU, Pin Lên đến 18 giờ, Khối lượng 1.29kg', 'mac.jpg', 19590000, sysdate(), sysdate(), 'LT', 5 );

select * from SanPham;