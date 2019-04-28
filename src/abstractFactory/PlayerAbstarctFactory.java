package abstractFactory;

import beans.Player;
//�������ҹ����ӿ�
public interface PlayerAbstarctFactory extends AbstractFactory{
	public Player createPlayer();
}
