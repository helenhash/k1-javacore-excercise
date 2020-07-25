package main;

	import java.sql.SQLException;
	import java.util.List;
	import java.util.Scanner;
	import dao.CustomerDAOImpl;
    import dao.CustomerDAO;
    import dto.CustomerDTOImpl;

	public class Main {
		private static String jdbcURL = "jdbc:mysql://localhost:3306/QuanlyMuaVeTau?autoReconnect=true&useSSL=false";
		private static String jdbcUsername = "root";
		private static String jdbcPassword = "1234";
				
		private static void themkhachhang() {
			CustomerDAO cusdao = new CustomerDAOImpl(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("============= THEM MOT KHACH HANG VAO HANG DOI=============");
			System.out.println("Nhap cmnd: ");
			Scanner scan0 = new Scanner(System.in);
			String cmnd = scan0.nextLine();
			
			System.out.println("Nhap ten: ");
			String name = scan0.nextLine();
			
			System.out.println("Nhap ga den: ");
			String gaden = scan0.nextLine();
			
			System.out.println("Nhap gia: ");
			double giatien = scan0.nextDouble();
			
			CustomerDTOImpl cusNhap = new CustomerDTOImpl(cmnd, name, gaden, giatien);
			try {
			cusdao.add(cusNhap);
			System.out.println("Them thanh cong");
			}catch (Exception e){
				System.out.println("kiểm tra lại giấy cmnd, đã tồn tại");
			}
		}
		
		private static void hienthikhachhang(){
			System.out.println("============= DANH SACH KHACH DANG DOI MUA VE ===============");
CustomerDAO customer = new CustomerDAOImpl(jdbcURL, jdbcUsername, jdbcPassword);
			
			try {
				List<CustomerDTOImpl> ls = customer.readbyadd();
				for (CustomerDTOImpl impl : ls) {
					System.out.println("Số chứng mnd: "+impl.getCmnd() +"  Tên: "+impl.getName()
					+"  Ga Đến: "+impl.getGaden() +"  Giá Tiền: "+impl.getGiatien() );
				}
			} catch (Exception e) {
				System.out.println("Error" + e.getMessage());
			}
		}
		
		private static void timkhach(){
			CustomerDAO cusdao = new CustomerDAOImpl(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("============= TIM MOT KHACH HANG THEO CMND =============");
			System.out.println("Nhap cmnd can tim: ");
			Scanner scan0 = new Scanner(System.in);
			String cmnd = scan0.nextLine();
			try {
			CustomerDTOImpl cu = cusdao.readcmnd(cmnd);
			System.out.println("Số cmnd: "+cu.getCmnd()+"  Tên: "+cu.getName()+"  Ga đến: "+
			cu.getGaden()+"  Giá Tiền: "+cu.getGiatien());
			} catch(Exception e) {
				System.out.println("không tìm thấy");
			}
			
		}
		
		private static void banve() {
			CustomerDAO cusdao = new CustomerDAOImpl(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("============= BAN VE =============");
			System.out.println("Nhap cmnd ban ve: ");
			Scanner scan0 = new Scanner(System.in);
			String cmnd = scan0.nextLine();
			try {
			cusdao.delete(cmnd);
			System.out.println("Da xoa khoi hang doi: ");
			}catch(Exception e) {
				System.out.println("kiểm tra lại cmnd");
			}
		}
		
		private static void chinhsuathongtin() {
			CustomerDAO cusdao = new CustomerDAOImpl(jdbcURL, jdbcUsername, jdbcPassword);
			System.out.println("============= CHINH SUA THONG TIN KHACH HANG =============");
			System.out.println("Nhap cmnd: ");
			Scanner scan0 = new Scanner(System.in);
			String cmnd = scan0.nextLine();
			
			System.out.println("Nhap ten: ");
			String name = scan0.nextLine();
			
			System.out.println("Nhap ga den: ");
			String gaden = scan0.nextLine();
			
			System.out.println("Nhap gia: ");
			double giatien = scan0.nextDouble();
			CustomerDTOImpl cusNhap = new CustomerDTOImpl(cmnd, name, gaden, giatien);
			try {
			cusdao.update(cusNhap);
			System.out.println("chinh sua thanh cong");
			}catch(Exception e){
				System.out.println("kiểm tra lại cmnd");
			}
		}
		
		public static void main(String[] args) {
			int key;
		do{
				System.out.println("======================= MENU =======================");
				System.out.println("bam (1) de them khach hang");
				System.out.println("bam (2) de hien thi khach hang");
				System.out.println("bam (3) de tim khach hang");
				System.out.println("bam (4) de ban ve");
				System.out.println("bam (5) de chinh sua thong tin");
				
				Scanner a = new Scanner(System.in) ;
				 key = a.nextInt();
				switch (key) {
				case 1:
					Main.themkhachhang();
					break;
				case 2:
					Main.hienthikhachhang();
					break;

				case 3:
					Main.timkhach();
					break;

				case 4:
					Main.banve();
					break;

				case 5:
					Main.chinhsuathongtin();
					break;


				default:
					System.out.println("khong ton tai");
					break;
				}
		}while( true );
			
			/*dấu ngoạt hàm main */
		}
	}

