/**
 * <p>���ýӿ�</p>
 * 
 * <p>ȡ�úͱ���������Ϣ</p>
 *
 * <p>Copyright: ��Ȩ���� (c) 1997 - 2007</p>
 * 
 * @author: huchao
  
 * @version 1.0
 */
public interface ChartSetting {
	public Info getInfo(DHBChartConfigBase config);
	public void saveInfo(Info info, DHBChartConfigBase config);
	public void doInit();
}
