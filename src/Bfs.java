import java.util.*;


public class Bfs {

	static int N = 0;

	static int M = 0;

	

	static int arr[][];

	static boolean [][]visited;

	

	public static void main(String [] args) {

		

		try {

			

			

			Scanner s = new Scanner(System.in);

			

			N = s.nextInt();

			M = s.nextInt();

			s.nextLine();

			

			arr = new int[N][M];

			

			visited = new boolean[N][M];

			

			for (int i = 0 ; i < N; i++) {

				String str = s.next();

				for(int j = 0 ; j < M; j++) {

					arr[i][j] = str.charAt(j)-'0'; //�������� int������ ����ȯ

					visited[i][j] = false;//���� �� �ʱ� ����

				}

			}

			

			visited[0][0] = true; //���� ��Ű������ �� ����

			BFS(0,0);

		}catch(Exception e) {

			e.printStackTrace();

		}

	}

	

	static void BFS(int start, int end) {

		try {

			Queue<Node> q = new LinkedList<>();

			q.add(new Node(start, end, 1));

			

			while(!q.isEmpty()) {

				

				Node node = q.poll();

				visited[node.x][node.y] = true;

				System.out.println(node.x + ", " + node.y);

				

				//��

				if(node.y-1 >= 0 && node.y-1 < M && arr[node.x][node.y-1] == 1 && visited[node.x][node.y-1] == false){

                    q.add(new Node(node.x,node.y-1,node.depth+1));

                }

				//��

				if(node.y+1 >= 0 && node.y+1 < M &&arr[node.x][node.y+1] == 1 && visited[node.x][node.y+1] == false){

                    q.add(new Node(node.x,node.y+1,node.depth+1));

                }

 

				//��	

                if(node.x-1 >= 0 && node.x-1 < N &&arr[node.x-1][node.y] == 1 && visited[node.x-1][node.y] == false){

                    q.add(new Node(node.x-1,node.y,node.depth+1));

                }

 

				//�Ʒ�

                if(node.x+1 >= 0 && node.x+1 < N && arr[node.x+1][node.y] == 1 && visited[node.x+1][node.y] == false){

                    q.add(new Node(node.x+1, node.y,node.depth+1));

                }

 

                if(visited[N-1][M-1]){

                    System.out.println("�Ϸ�");

                    System.out.println(node.depth);

                    break;

                }

				

			}

		}catch(Exception e) {

			e.printStackTrace();

		}

	}

}

class Node{

	int x;

	int y;

	int depth;

	

	Node(int x, int y, int depth){

		this.x = x;

		this.y = y;

		this.depth = depth;

	}

}
