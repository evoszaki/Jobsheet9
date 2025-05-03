public class StackSurat {
    private Surat17[] stack;
    private int top;
    private int size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
    
    public void push(Surat17 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat izin berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }
    
    public Surat17 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diproses.");
            return null;
        }
    }
 
    public Surat17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return false;
        }
        
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat izin ditemukan:");
                stack[i].print();
                return true;
            }
        }
        
        System.out.println("Surat izin dengan nama mahasiswa " + nama + " tidak ditemukan.");
        return false;
    }
}