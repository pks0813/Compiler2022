/*
Test Package: Codegen
Author: 10' Huan Yang
Time: 2020-02-02
Input:
=== input ===
168
=== end ===
Output:
=== output ===
3 5 7
3 7 11
3 11 19
3 13 23
3 17 31
3 23 43
3 31 59
3 37 71
3 41 79
3 43 83
3 53 103
3 67 131
3 71 139
3 83 163
3 97 191
3 101 199
3 107 211
3 113 223
3 127 251
3 137 271
3 157 311
3 167 331
3 181 359
3 191 379
3 193 383
3 211 419
3 223 443
3 233 463
3 241 479
3 251 499
3 263 523
3 283 563
3 311 619
3 317 631
3 331 659
3 347 691
3 373 743
3 421 839
3 431 859
3 433 863
3 443 883
3 457 911
3 461 919
3 487 971
5 11 17 23 29
5 17 29 41 53
5 23 41 59
5 29 53
5 47 89 131 173
5 53 101 149 197
5 59 113 167
5 71 137
5 89 173 257
5 101 197 293 389
5 131 257 383 509
5 137 269 401
5 149 293
5 179 353
5 197 389
5 227 449
5 233 461
5 257 509 761
5 263 521
5 281 557
5 311 617
5 353 701
5 383 761
5 389 773
5 401 797
5 431 857
5 443 881
5 467 929
5 479 953
5 491 977
7 13 19
7 19 31 43
7 37 67 97 127 157
7 43 79
7 67 127
7 73 139
7 79 151 223
7 103 199
7 109 211 313
7 139 271
7 157 307 457 607 757 907
7 193 379
7 223 439
7 277 547
7 307 607 907
7 313 619
7 349 691
7 367 727
7 373 739
7 379 751
7 397 787
7 409 811
7 433 859
7 457 907
7 463 919
7 487 967
7 499 991
11 29 47
11 41 71 101 131
11 47 83
11 59 107
11 71 131 191 251 311
11 89 167
11 101 191 281
11 131 251
11 137 263 389
11 179 347
11 197 383 569
11 227 443 659
11 239 467
11 251 491
11 257 503
11 347 683
11 419 827
11 449 887
11 461 911
11 479 947
11 491 971
13 37 61
13 43 73 103
13 61 109 157
13 97 181
13 103 193 283 373 463
13 127 241
13 163 313 463 613
13 181 349
13 193 373
13 211 409 607
13 223 433 643 853
13 277 541
13 307 601
13 313 613
13 337 661
13 373 733
13 421 829
13 433 853
17 53 89
17 59 101
17 83 149
17 107 197
17 137 257
17 149 281
17 167 317 467 617
17 233 449
17 239 461 683
17 263 509
17 269 521 773
17 293 569
17 317 617
17 347 677
17 359 701
17 389 761
17 419 821
17 449 881
17 479 941
19 43 67
19 61 103
19 73 127 181
19 79 139 199
19 109 199
19 151 283
19 163 307
19 193 367 541
19 199 379
19 229 439
19 241 463
19 271 523
19 283 547 811
19 313 607
19 331 643
19 373 727
19 379 739
19 421 823
19 439 859
19 463 907
23 47 71
23 53 83 113
23 101 179 257
23 107 191
23 131 239 347
23 137 251
23 167 311
23 191 359
23 227 431
23 233 443 653 863
23 251 479
23 257 491
23 263 503 743 983
23 293 563
23 311 599 887
23 353 683
23 383 743
23 431 839
23 443 863
23 467 911
23 503 983
29 59 89
29 71 113
29 83 137 191
29 89 149
29 101 173
29 113 197 281
29 131 233
29 149 269 389 509
29 173 317 461
29 191 353
29 239 449 659
29 269 509
29 293 557 821
29 311 593
29 353 677
29 401 773
29 419 809
29 443 857
29 479 929
29 491 953
29 503 977
31 37 43
31 67 103 139
31 79 127
31 97 163 229
31 127 223
31 151 271
31 157 283 409
31 181 331
31 199 367
31 277 523 769
31 331 631
31 337 643
31 379 727
31 409 787
31 421 811
31 457 883
31 499 967
37 73 109
37 97 157
37 109 181
37 139 241
37 157 277 397
37 193 349
37 223 409
37 229 421 613
37 307 577
37 349 661
37 373 709
37 397 757
37 433 829
37 457 877
37 487 937
41 47 53 59
41 89 137
41 107 173 239
41 137 233
41 149 257
41 167 293 419
41 179 317
41 197 353 509
41 251 461
41 281 521 761
41 317 593
41 347 653
41 359 677
41 401 761
41 419 797
41 431 821
41 449 857
41 461 881
41 491 941
41 509 977
43 61 79 97
43 97 151
43 103 163 223 283
43 127 211
43 157 271
43 163 283
43 211 379 547
43 241 439
43 271 499 727
43 283 523
43 307 571
43 331 619 907
43 337 631
43 367 691
43 397 751
43 433 823
43 463 883
47 59 71 83
47 107 167 227
47 113 179
47 137 227 317
47 149 251 353
47 179 311 443
47 197 347
47 233 419
47 239 431
47 257 467 677 887
47 263 479
47 269 491
47 317 587 857
47 347 647 947
47 353 659
47 383 719
47 443 839
47 467 887
47 479 911
47 509 971
53 71 89 107
53 113 173 233 293 353
53 167 281
53 173 293
53 227 401
53 251 449 647
53 257 461
53 281 509
53 311 569 827
53 347 641
53 353 653 953
53 431 809
53 467 881
53 491 929
53 503 953
59 83 107 131
59 149 239
59 239 419 599
59 251 443
59 263 467
59 269 479
59 281 503
59 311 563
59 353 647 941
59 359 659
59 389 719
59 401 743
59 443 827
59 449 839
59 461 863
59 503 947
59 521 983
61 67 73 79
61 127 193
61 151 241 331 421
61 199 337
61 229 397
61 241 421 601
61 331 601
61 337 613
61 367 673
61 397 733
61 409 757
61 457 853
61 499 937
67 109 151 193
67 139 211 283
67 199 331 463
67 223 379
67 277 487
67 283 499
67 307 547 787
67 337 607 877
67 349 631
67 379 691
67 397 727
67 409 751
67 439 811
67 463 859
67 487 907
71 149 227
71 167 263 359
71 191 311 431
71 227 383
71 251 431
71 257 443
71 269 467
71 281 491 701 911
71 317 563 809
71 359 647
71 449 827
71 467 863
71 479 887
71 491 911
71 509 947
71 521 971
73 151 229 307
73 157 241
73 193 313 433
73 211 349 487
73 223 373 523 673 823
73 241 409 577
73 307 541
73 337 601
73 367 661
73 373 673
73 421 769
73 463 853
79 103 127 151
79 109 139
79 181 283
79 193 307 421
79 223 367
79 229 379
79 271 463
79 283 487 691
79 313 547
79 349 619
79 409 739
79 433 787
79 499 919
79 523 967
83 131 179 227
83 167 251
83 173 263 353 443
83 197 311
83 233 383
83 251 419 587
83 257 431
83 263 443
83 281 479 677
83 293 503
83 383 683 983
83 401 719
83 461 839
89 101 113
89 113 137
89 179 269 359 449
89 191 293
89 239 389
89 269 449
89 353 617 881
89 383 677 971
89 431 773
89 443 797
89 449 809
89 509 929
89 521 953
97 103 109
97 139 181 223
97 223 349
97 277 457
97 337 577
97 349 601 853
97 379 661
97 433 769
97 463 829
97 487 877
97 547 997
101 107 113
101 137 173
101 167 233
101 227 353 479
101 251 401
101 281 461 641 821
101 311 521
101 347 593 839
101 359 617
101 389 677
101 401 701
101 431 761
101 449 797
101 461 821
101 479 857
101 491 881
101 521 941
103 151 199
103 157 211
103 241 379
103 271 439 607
103 283 463 643 823
103 313 523 733
103 337 571
103 367 631
103 373 643
103 397 691
103 421 739
103 457 811
103 463 823
103 547 991
107 137 167 197 227 257
107 149 191 233
107 179 251
107 227 347 467 587
107 233 359
107 263 419
107 269 431 593
107 293 479
107 347 587 827
107 353 599
107 383 659
107 467 827
107 509 911
109 193 277
109 223 337
109 229 349
109 241 373
109 271 433
109 283 457 631
109 409 709
109 421 733
109 433 757
109 439 769
109 523 937
113 131 149 167
113 191 269 347
113 233 353
113 251 389
113 257 401
113 281 449 617
113 311 509
113 317 521
113 353 593
113 383 653
113 443 773
113 461 809
113 467 821
113 521 929
127 139 151 163
127 163 199
127 199 271
127 229 331 433
127 283 439
127 307 487
127 313 499
127 337 547 757 967
127 349 571
127 367 607
127 373 619
127 379 631 883
127 409 691
127 433 739
127 439 751
127 457 787
127 523 919
127 547 967
131 197 263
131 281 431
131 311 491
131 317 503
131 347 563
131 359 587
131 389 647
131 479 827
131 509 887
131 521 911
131 557 983
137 197 257 317
137 293 449
137 347 557
137 353 569
137 389 641
137 419 701 983
137 449 761
137 467 797
137 479 821
137 509 881
137 557 977
139 223 307
139 313 487 661
139 331 523
139 373 607
139 379 619 859
139 433 727
139 439 739
139 463 787
139 499 859
139 523 907
149 173 197
149 233 317 401
149 353 557 761
149 359 569
149 383 617
149 401 653
149 461 773
149 479 809
149 503 857
149 563 977
151 157 163
151 181 211 241 271
151 211 271 331
151 307 463 619
151 337 523 709
151 349 547
151 379 607
151 397 643
151 421 691
151 439 727
151 487 823
151 571 991
157 193 229
157 199 241 283
157 349 541 733
157 367 577 787 997
157 379 601 823
157 409 661
157 433 709
157 457 757
157 463 769
157 547 937
157 577 997
163 181 199
163 193 223
163 271 379 487
163 331 499
163 367 571
163 397 631
163 457 751
163 487 811
163 523 883
163 541 919
163 577 991
167 173 179
167 179 191
167 239 311 383
167 257 347
167 383 599
167 443 719
167 503 839
167 557 947
167 569 971
173 227 281
173 281 389
173 311 449 587
173 347 521
173 383 593
173 467 761
173 491 809
173 557 941
173 563 953
179 263 347 431
179 281 383
179 383 587
179 389 599 809
179 419 659
179 431 683
179 449 719
179 461 743
179 503 827
179 509 839
179 521 863
179 563 947
181 229 277
181 277 373
181 307 433
181 379 577
181 397 613 829
181 421 661
181 457 733
191 227 263
191 317 443 569
191 347 503 659
191 389 587
191 419 647
191 467 743
191 509 827
191 569 947
191 587 983
193 211 229
193 271 349
193 397 601
193 433 673
193 463 733
193 523 853
197 233 269
197 239 281
197 359 521 683
197 419 641 863
197 449 701 953
197 479 761
197 503 809
197 509 821
197 563 929
197 569 941
197 587 977
199 211 223
199 283 367
199 349 499
199 373 547
199 409 619 829
199 421 643
199 463 727 991
199 541 883
211 337 463
211 367 523
211 421 631
211 499 787
211 547 883
211 601 991
223 277 331
223 331 439 547
223 397 571
223 421 619
223 457 691
223 487 751
223 523 823
223 541 859
223 571 919
223 607 991
227 233 239
227 239 251 263
227 269 311 353
227 293 359
227 359 491
227 557 887
227 569 911
227 587 947
227 599 971
229 271 313
229 283 337
229 313 397
229 499 769
229 541 853
229 613 997
233 251 269
233 257 281
233 263 293
233 311 389 467
233 347 461
233 401 569
233 467 701
233 503 773
233 521 809
233 557 881
233 587 941
233 593 953
239 293 347 401
239 353 467
239 359 479 599 719 839
239 401 563
239 443 647
239 479 719
239 491 743
239 563 887
239 593 947
241 277 313 349
241 307 373 439
241 337 433
241 349 457
241 457 673
241 487 733
241 499 757
241 547 853
241 619 997
251 257 263 269
251 281 311
251 317 383 449
251 347 443
251 359 467
251 467 683
251 557 863
251 569 887
251 599 947
251 617 983
257 269 281 293
257 353 449
257 359 461 563
257 389 521 653
257 449 641
257 479 701
257 557 857
257 569 881
257 593 929
257 599 941
257 617 977
263 311 359
263 383 503
263 431 599
263 461 659 857
263 491 719 947
263 563 863
263 587 911
263 617 971
269 293 317
269 419 569 719
269 443 617
269 461 653
269 563 857
269 599 929
271 277 283
271 367 463
271 397 523
271 409 547
271 421 571
271 457 643 829
271 541 811
271 547 823
271 577 883
271 619 967
271 631 991
277 307 337 367 397
277 337 397 457
277 349 421
277 367 457 547
277 409 541 673
277 439 601
277 577 877
277 607 937
281 317 353 389
281 401 521 641 761 881
281 419 557
281 467 653 839
281 569 857
281 617 953
283 307 331
283 331 379
283 571 859
283 601 919
293 401 509 617
293 431 569
293 443 593 743
293 467 641
293 587 881
293 617 941
307 397 487 577
307 439 571
307 499 691 883
307 523 739
307 613 919
311 347 383 419
311 401 491
311 479 647
311 587 863
311 641 971
311 647 983
313 331 349 367
313 367 421
313 373 433
313 457 601
313 541 769 997
313 571 829
317 359 401 443
317 389 461
317 419 521
317 479 641
317 509 701
317 557 797
317 569 821
317 599 881
317 647 977
331 397 463
331 409 487
331 487 643
331 541 751
331 571 811
331 577 823
331 607 883
331 661 991
337 373 409
337 379 421 463
337 439 541 643
337 457 577
337 499 661 823
347 353 359
347 389 431
347 419 491 563
347 617 887
347 659 971
349 373 397 421
349 379 409 439
349 463 577 691
349 613 877
349 643 937
349 673 997
353 401 449
353 431 509 587
353 461 569 677
353 503 653
353 563 773 983
353 587 821
353 641 929
359 389 419 449 479 509
359 419 479
359 431 503
359 503 647
359 509 659 809
359 593 827
359 599 839
359 653 947
367 373 379
367 433 499
367 487 607 727
367 499 631
367 547 727 907
367 613 859
367 643 919
373 457 541
373 487 601
373 541 709 877
373 571 769 967
373 601 829
373 613 853
379 433 487 541
379 439 499
379 463 547 631
379 499 619 739 859
379 643 907
379 673 967
383 401 419
383 431 479
383 443 503 563
383 491 599
383 521 659 797
383 563 743
383 647 911
389 449 509 569
389 479 569 659
389 491 593
389 503 617
389 593 797
389 659 929
389 683 977
397 409 421 433
397 499 601
397 577 757 937
401 431 461 491 521
401 461 521
401 479 557
401 587 773
401 599 797
401 641 881
401 677 953
409 433 457
409 571 733
409 631 853
409 643 877
409 673 937
419 431 443
419 443 467 491
419 461 503
419 503 587
419 509 599
419 653 887
419 683 947
421 439 457
421 499 577
421 541 661
421 547 673
421 577 733
421 709 997
431 449 467
431 467 503
431 557 683 809
431 587 743
431 647 863
431 659 887
431 701 971
433 523 613
433 547 661
433 571 709
433 601 769 937
433 631 829
439 463 487
439 523 607 691
439 613 787
439 631 823
439 661 883
439 673 907
443 461 479
443 521 599 677
443 563 683
443 641 839
443 677 911
449 503 557
449 521 593
449 563 677
449 653 857
457 499 541
457 613 769
457 727 997
461 509 557
461 557 653
461 617 773 929
461 701 941
461 719 977
463 541 619
463 601 739 877
463 607 751
463 661 859
463 673 883
463 691 919
467 479 491 503
467 557 647
467 563 659
467 593 719
467 647 827
467 719 971
479 521 563
479 563 647
479 653 827
479 659 839
479 683 887
487 547 607
487 613 739
487 619 751 883
487 673 859
487 727 967
487 739 991
491 569 647
491 587 683
491 617 743
491 659 827
491 677 863
499 523 547 571
499 571 643
499 613 727
499 643 787
499 709 919
499 733 967
503 593 683 773 863 953
503 683 863
509 563 617
509 593 677 761
509 641 773
509 653 797 941
509 683 857
509 719 929
509 743 977
521 557 593
521 569 617
521 587 653 719
521 647 773
521 701 881
523 571 619
523 577 631
523 631 739
523 691 859
523 757 991
541 571 601 631 661 691
541 577 613
541 601 661
541 607 673 739
541 739 937
547 577 607
547 619 691
547 643 739
547 733 919
547 769 991
557 563 569
557 587 617 647 677
557 599 641 683
557 617 677
557 659 761 863
557 677 797
557 719 881
557 743 929
563 641 719 797
563 653 743
563 701 839 977
569 593 617 641
569 683 797 911
569 761 953
569 773 977
571 607 643
571 631 691 751 811
571 661 751
571 691 811
571 727 883
571 739 907
577 619 661
577 643 709
577 673 769
577 727 877
587 593 599
593 647 701
593 701 809
593 761 929
593 773 953
599 659 719
599 743 887
599 773 947
601 607 613 619
601 727 853
607 619 631 643
607 709 811
607 733 859
607 787 967
613 643 673
613 661 709 757
613 673 733
613 691 769
613 733 853
617 659 701 743
617 719 821
617 797 977
619 673 727
619 769 919
631 709 787
631 727 823 919
631 757 883
631 769 907
631 811 991
641 647 653 659
641 659 677
641 701 761 821 881 941
641 797 953
641 809 977
643 691 739 787
643 727 811
643 733 823
643 751 859 967
647 683 719
647 743 839
647 797 947
647 809 971
653 677 701
659 743 827 911
659 773 887
659 821 983
661 757 853
661 769 877
661 829 997
673 691 709 727
673 751 829 907
677 719 761
677 743 809
677 809 941
677 827 977
683 701 719
683 761 839
683 827 971
691 757 823
691 787 883
691 829 967
701 821 941
701 827 953
709 733 757
709 739 769
709 769 829
709 823 937
709 853 997
719 773 827 881
727 733 739
727 739 751
727 757 787
727 769 811 853
727 859 991
733 751 769 787
739 811 883
739 823 907 991
739 829 919
739 853 967
743 857 971
743 863 983
751 787 823 859
757 877 997
761 809 857
761 857 953
769 823 877
769 853 937
769 883 997
773 797 821
773 857 941
787 853 919
787 877 967
797 809 821
797 827 857 887
797 839 881
797 863 929
797 887 977
809 881 953
811 859 907
821 839 857
821 887 953
823 853 883
827 887 947
829 853 877
829 883 937 991
839 863 887 911
839 911 983
859 883 907
877 907 937 967 997
877 937 997
881 911 941 971
881 929 977
887 929 971
911 929 947
911 947 983
929 941 953
929 953 977
941 947 953
971 977 983
Total: 1182
=== end ===
ExitCode: 0
InstLimit: -1
Origin Package: Codegen Pretest-569
*/

int N;
int M;
int i;
int j;
int primeCount;
int resultCount;
int[] b = new int[1001];
int[] prime = new int[170];
int[] gps = new int[1001];
int[] tmp = new int[1];
int[][] result;

void origin(int N)
{
	result = new int[N][];
    for (i = 0; i < N; i ++ ) {
		result[i] = new int[N];
        for (j = 0; j < N; j ++ )
        result[i][j] = 0;
    }
}

//int getPrime(int N, int* primeCount, int* b, int* gps, int* prime) {
void getPrime(int N) {
    int count;
	int i;
    count = 2;
    for (i = 2; i <= N; i = i + 1) {
        if (b[i] == 1) {
            tmp[0] = tmp[0] + 1;
            prime[tmp[0]] = i;
            gps[i] = tmp[0];
        }
        while (i * count <= N) {
            b[i * count] = 0;
            count = count + 1;
        }
        count = 2;
    }
}

//int getResult(int N, int k1, int k2, int* b, int* gps, int* prime, int result[170][170]) {
int getResult(int N, int k1, int k2) {
    if (result[k1][k2] == -1)
        if (prime[k2] * 2 - prime[k1] <= N)
            if (b[prime[k2] * 2 - prime[k1]] != 0)
                result[k1][k2] = getResult(N,
                                k2,
                                gps[prime[k2] * 2 - prime[k1]]
                                ) + 1;
    if (result[k1][k2] == -1)
        result[k1][k2] = 1;
    return result[k1][k2];
}

void printF(int k1, int k2, int k3) {
//    printf("%d", k1);
	print(toString(k1));
    while (k3 > 0) {
//        printf("%c", ' ');
		print(" ");
//        printf("%d", k2);
		print(toString(k2));
        k2 = k2 * 2 - k1;
        k1 = (k1 + k2) / 2;
        k3 = k3 - 1;
    }
//    printf("%c", '\n');
    print("\n");
}

int main() {
	origin(170);
    N = 1000;
//    M = 100*(getchar()-'0')+10*(getchar()-'0')+getchar()-'0';
	M = getInt();
    primeCount = 0;
    resultCount = 0;
    tmp[0] = 0;
    for (i = 0; i < N + 1; i = i + 1)
    {
        b[i] = 1;
        gps[i] = 0;
    }
    for (i = 0; i < M + 1; i = i + 1)
    {
        prime[i] = 0;
    }
    for (i = 0; i <= M; i = i + 1)
    {
        for (j = 0; j <= M; j = j + 1)
            result[i][j] = -1;
    }
//    getPrime(N, tmp, b, gps, prime);
    getPrime(N);
    primeCount = tmp[0];
    for (i = 1; i < primeCount; i = i + 1)
        for (j = i + 1; j <= primeCount; j = j + 1)
            if (result[i][j] == -1) {
                result[i][j] = getResult(N, i, j);
                if (result[i][j] > 1) {
                    printF(prime[i], prime[j], result[i][j]);
                    resultCount = resultCount + 1;
                }
            }
    //printf("Total: %d\n", resultCount);
	print("Total: ");
	println(toString(resultCount));
    return 0;
}