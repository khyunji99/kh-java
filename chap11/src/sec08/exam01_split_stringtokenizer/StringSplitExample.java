package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		// String�� �迭�� ���ҿ��� & �Ǵ� , �Ǵ� - �� �����ڵ��
		// ���ڿ��� �ɰ��� ���ڿ����� �迭�� ����.
		// ��, String[] names = {"ȫ�浿", "�̼�ȫ", "�ڿ���", "���ڹ�", "�ָ�ȣ"};
		// �̷��� �ȴ�.
		
		
		String text2 = "����,�ʹ�,����";
		String[] words = text2.split(",");
		
		
		// �迭�� ���ҵ��� �ϳ��� ����Ҷ���
		// ������ ���� ���� for���� ����ؼ� ����ϴ°� �� ����.
		System.out.println("--- ���� for�� ��� ---");
		for(String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		System.out.println("--- �Ϲ����� for�� ��� ---");
		// �Ϲ����� for��
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
		System.out.println("--- ���� for�� ��� ---");
		for(String word : words) {
			System.out.print(word + " ");
		}
		
	}
}
// split()
// String[] result = "���ڿ�".split("����ǥ����");
// ����ǥ������ �����ڷ� �ؼ� ���ڿ��� �и��� �� �迭�� �����ϰ� �����Ѵ�.
// ex) String[] name = text.split("& | , | -");