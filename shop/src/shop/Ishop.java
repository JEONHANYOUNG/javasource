package shop;

// ���� �߻�ȭ => ��� �ʵ�, �߻�޼ҵ常 ����
// jdk8 => default, static �޼��� ���� ��  �ֱ�� ��

public interface Ishop {
	public void SetTitle(String title); // public abstract �κ��� ������
	public void genUser();
	public void genProduct();
	public void start();
}
