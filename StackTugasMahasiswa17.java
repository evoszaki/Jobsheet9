public class StackTugasMahasiswa17 {
    Mahasiswa17[] stack;
    int top;
    int size;

    public StackTugasMahasiswa17(int size) {
        this.size = size;
        stack = new Mahasiswa17[size];
        top = -1;
    }
    
    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa17 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh! tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa17 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public Mahasiswa17 bottom() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    
    public int jumlahTugas() {
        return top + 1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t");
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi17 stack = new StackKonversi17();
    
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
    
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
