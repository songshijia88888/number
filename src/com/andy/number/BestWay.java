package com.andy.number;

public class BestWay {
	private int[] target = {3, 5, 8, 9, 17, 26};
	private int stopCount = 3;
	private int[] path = new int[stopCount];
	public int[] getPath() {
		return path;
	}

	public void setPath(int[] path) {
		this.path = path;
	}


	private int pathCount = 0;
	
	public BestWay(){
		
	}
	
	public int[] getTarget() {
		return target;
	}

	public void setTarget(int[] target) {
		this.target = target;
	}

	public BestWay(int[] target, int stopCount){
		this.target = target;
		this.stopCount = stopCount;
		this.path = new int[stopCount];
	}
	
	public int timeCalculator(int floor, int elevator, int hasStoppedCount){
		if(floor == target[target.length-1]){
			return 10 * stopCount + (floor -1 ) * 4;
		}
		else{
			int step = floor - elevator;
			if(step < 0){
				step = -1 * step;
			}
			return 10 * hasStoppedCount + (elevator - 1) * 4 + step * 20;
		}
	}
	
	
	public void stopPath(int base, int startPoint, int length){
		//System.out.println("base:" + base + ", startPoint:" + startPoint + ", length:" + length);
		int endPoint = base + length - stopCount + pathCount + 1;
		if(endPoint > target.length){
			endPoint = target.length;
		}
		for (int i = startPoint; i < endPoint; i++) {

			path[pathCount] = i;
			pathCount++;

			// System.out.println("pathCount:" + pathCount);

			if (pathCount < stopCount) {
				stopPath(i, i + 1, target.length - i - 1);
			} else {
				System.out.print("order:");
				for (int j = 0; j < path.length; j++) {
					System.out.print(path[j] + " ");
				}
				System.out.print("floor:");
				for (int j = 0; j < path.length; j++) {
					System.out.print(target[path[j]] + " ");
					//循环计算各楼层到达时间，昨到最优解
				}
				System.out.println("");
				pathCount--;
			}
		}
		pathCount--;
	}
}
