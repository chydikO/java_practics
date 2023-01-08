package ua.step.example.part2.structural.t1.facade;

/**
 * Шаблон фасад (англ. Facade) — структурный шаблон проектирования, позволяющий
 * скрыть сложность системы путём сведения всех возможных внешних вызовов к
 * одному объекту, делегирующему их соответствующим объектам системы.
 */
public class Task00
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.startComputer();
    }
}

/* Complex parts */
class CPU
{
    public void freeze()
    {
        System.out.println("Процессор запушен");
    }

    public void jump(long position)
    {
        System.out.println("Обращение к инструкции ЦПУ");
    }

    public void execute()
    {
        System.out.println("Выполнение загрузчика системы");
    }
}

class Memory
{
    public void load(long position, byte[] data)
    {
        System.out.printf("Загрузка данных из памяти по адресу %d%n", position);
    }
}

class HardDrive
{
    public byte[] read(long lba, int size)
    {
        System.out.println("Чтение сектора загрузки с жесткого диска");
        return null;
    }
}

/**
 * Фасад
 */
class Computer
{
    private static final long BOOT_ADDRESS = 0;
    private static final long BOOT_SECTOR = 10;
    private static final int SECTOR_SIZE = 5;
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer()
    {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer()
    {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}