```c++
#include <stdio.h>
#include <conio.h>
#include <iostream>
#define DATAMAX 50

typedef int bulat;

struct nilaiMHS
{	char npm[11];
	bulat hadir, tugas, quiz, nts, nas;
};

int main()
{	nilaiMHS recNilaiMHS[DATAMAX];
	bulat jmlData, i;
	float rataRata;
	char grade, ket[16];

	printf("Berapa jumlah data = "); scanf("%d",&jmlData);
	for (i=0; i<jmlData; i++)
	{

        std::cout << "Data Nilai Mahasiswa ke-" << (i+1) << std::endl;
		printf("Nomor Pokok Mahasiswa = "); std::cin >> recNilaiMHS[i].npm;
		printf("Persentase Kehadiran  = "); scanf("%i",&recNilaiMHS[i].hadir);
		printf("Nilai Tugas           = "); scanf("%d",&recNilaiMHS[i].tugas);
		printf("Nilai Quiz            = "); scanf("%d",&recNilaiMHS[i].quiz);
		printf("Nilai Tengah Semester = "); scanf("%i",&recNilaiMHS[i].nts);
		printf("Nilai Akhir Semester  = "); scanf("%i",&recNilaiMHS[i].nas);
	}

	std::cout << "\n" << std::endl;
	std::cout << "DAFTAR NILAI MAHASISWA" << std::endl;
	std::cout << "+----------+-------+-------+-------+-------+-------+-------+-------+" << std::endl;
	std::cout << "|   NPM    | Hadir | Tugas | Quiz  |  NTS  |  NAS  | Rata2 | Grade |" << std::endl;
	std::cout << "+----------+-------+-------+-------+-------+-------+-------+-------+" << std::endl;
	for (i=0; i<jmlData; i++)
	{	rataRata=(float) 0.1*recNilaiMHS[i].hadir + 0.1*recNilaiMHS[i].quiz +
		0.1*recNilaiMHS[i].tugas + 0.3*recNilaiMHS[i].nts + 0.4*recNilaiMHS[i].nas;
		if (rataRata>=80)      { grade='A'; }
		else if (rataRata>=70) { grade='B'; }
		else if (rataRata>=60) { grade='C'; }
		else if (rataRata>=50) { grade='D'; }
		else                   { grade='E'; }
		printf("|%10s|%7d|%7d|%7d|%7d|%7d|%7.2f|   %c   |\n", recNilaiMHS[i].npm,
		recNilaiMHS[i].hadir, recNilaiMHS[i].tugas, recNilaiMHS[i].quiz,
		recNilaiMHS[i].nts, recNilaiMHS[i].nas, rataRata, grade);
	}
	std::cout << "+----------+-------+-------+-------+-------+-------+-------+-------+";
	getch();
}

```
