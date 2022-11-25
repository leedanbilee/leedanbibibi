package Day06.Ex04_Board;

import java.util.Scanner;

public class Main {
	
	
	static int max = 10; // 게시글 최대 10개 제한
	static int index = 0;	// 현재 게시글 순서번호(0 ~ max-1)
	static Board[] boardList = new Board[max];
	// static을 붙이면 각 메소드에 객체를 생성하지 않아도 변수 사용 가능.
	// 메뉴판

	public static void showMenu() {
		System.out.println("##########게시판#########");
		System.out.println("1. 게시글목록");
		System.out.println("2. 게시글읽기");
		System.out.println("3. 게시글쓰기");
		System.out.println("4. 게시글수정");
		System.out.println("5. 게시글삭제");
		System.out.println("########## 번호 입력 :");

	}

	// 게시글 목록
	public static void list() {
		System.out.println("# 게시글 목록");
		for (Board board : boardList) {
			System.out.println(board);
		}
	}
	// 게시글 읽기
	public static void read(int boardNo) {
		Board board = boardList[boardNo-1];
		System.out.println(board);
	}
	// 게시글 쓰기
	public static void write(Board board) {
		if( index < max) {
			boardList[index] = board;
			index++;
			board.setBoardNo(index);
		}else {
				System.out.println("게시글 목록 꽉 찼습니다.");
		}
	}
	// 게시글 수정
	public static void update(int boardNo, Board board) {
		//0 1 2 3 4  ... -> 배열 인덱스
		//1 2 3 4 5  ... -> 값
		if ( boardNo >=1 && boardNo <= max) {
			boardList[boardNo-1] = board;
		} else { 
			System.out.println("게시글이 존재하지 않습니다.");
		}
	}
	// 게시글 삭제
	public static void delete(int boardNo) {
		if ( boardNo >=1 && boardNo <= max) {
			boardList[boardNo-1] = null;
		} else { 
			System.out.println("게시글이 존재하지 않습니다.");
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		int count = 0;		// 게시글 개수

		// 메뉴판 반복하여 출력
		do {
			showMenu();
			// 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			int boardNo =0 ;
			String title = "";
			String content = "";
			String writer = "";
			Board board = null;
			
			// 메뉴 선택
			switch (menuNo) {
				// 게시글 목록
				case 1: list();
						break;
				// 게시글 읽기
				case 2: System.out.print("게시글 번호 : ");
						boardNo = sc.nextInt();
						read(boardNo);
						break;
				// 게시글 쓰기
				case 3: 
						System.out.print("제목 : ");
						title = sc.nextLine();
						System.out.print("내용 : ");
						content = sc.nextLine();
						System.out.print("작성자 : ");
						writer = sc.nextLine();
						board = new Board(title, content, writer);
						write(board);
						break;
				// 게시글 수정
				case 4: 
						System.out.print("게시글 번호 : ");
						boardNo = sc.nextInt();
						System.out.print("제목 : ");
						title = sc.nextLine();
						System.out.print("내용 : ");
						content = sc.nextLine();
						System.out.print("작성자 : ");
						writer = sc.nextLine();
						board = new Board(title, content, writer);
						update(boardNo, board);
						break;
				// 게시글 삭제
				case 5:
						System.out.print("게시글 삭제 :");
						boardNo = sc.nextInt();
						sc.nextLine();
						delete(boardNo);
						break;
		
				default:
					break;
				}

		} while (count <= max);

	}
}
