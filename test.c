
int N;
int M = 0;
bool[] check;

int main() {
    N = getInt();
	check = new bool[N+5];
	int i = 0;
	while ( i <= N ) check[i++] = true;
	int[] phi = new int[N+5];
	int[] P = new int[N+5];
	phi[1] = 1;
	for (i = 2; ; ++i ) {
		if ( i > N ) break;
		if ( check[i] ) {
			P[++M] = i;
			phi[i] = i - 1;
		}
		int k = i;
		int i;
		for (i = 1; i <= M && (k * P[i] <= N); i++) {
			int tmp = k * P[i];
			if ( tmp > N ) continue;
			check[tmp] = false;
			if ( k % P[i] == 0) {
				phi[tmp] = phi[k] * P[i];
				break;
			}
			else {
				phi[k * P[i]] = phi[k] * (P[i] - 1);
			}
		}
		println(toString(phi[k]));
	}
    return 0;
}
