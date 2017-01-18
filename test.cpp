	#include<iostream>
	#include <fstream>
	#include <vector>
	#include <string>
	#include <queue>
	#include <deque>
	#include <stack>
	using namespace std;
	#define pb 	push_back
	#define mp 	make_pair
	int main(){
		ifstream fin("gates.in");
		ofstream fout("gates.out");
		
		int N = 0; fin >> N; 
		string s; fin >> s;
		
		int currX = 1002;
		int currY = 1002;//origin
		bool isFence[2005][2005];//the map of the farm, true if there is a Node(fenceWall or fencePost)
		isFence[currX][currY] = true;//make isFence, with an extra node btw fencePosts to denote fenceWall and allow FloodFill
		
		for(int i = 0; i < s.size(); i++){
			int dirX = 0, dirY = 0;
			if(s[i] == 'N'){
				dirY = 1;
			}
			else if(s[i] == 'S'){
				dirY = -1;
			}
			else if(s[i] == 'E'){
				dirX = 1;
			}
			else{
				dirX = -1;
			}
			for(int a = 0; a < 2; a++){
				currX += dirX; 
				currY += dirY;
				isFence[currX][currY] = true;
			}
		}//isFence has been created
		
		int ret = -1;
		int dx[4] = {-1,1,0,0};
		int dy[4] = {0,0,-1,1};
		for(int ii = 0; ii < 2005; ii++){
			for(int jj = 0; jj < 2005; jj++){
				if(isFence[ii][jj]){
					continue;
				}
				ret++;
				queue<pair<int,int>> myQueue;
				myQueue.push(mp(ii,jj));
				isFence[ii][jj] = true;
				while(!myQueue.empty()){
					pair<int,int> curr = myQueue.front(); myQueue.pop();
					for(int poss = 0; poss < 4; poss++){
						int nx = curr.first + dx[poss];
						int ny = curr.second + dy[poss];
						if(nx >= 0 && nx < 2005 && ny >= 0 && ny < 2005 && !isFence[nx][ny]){
							isFence[nx][ny] = true;
							myQueue.push(mp(nx,ny));
						}//changed immediate neighboring areas into fencePosts
					}//gone thru immediate neighboring areas
				}//gone thru all areas of this particular open field
			}
		}
		//number of gates = number of fields - 1
		fout << ret << endl;
		fout.close();
	}