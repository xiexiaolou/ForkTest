/**
 * <p>配置接口</p>
 * 
 * <p>取得和保存配置信息</p>
 *
 * <p>Copyright: 版权所有 (c) 1997 - 2007</p>
 
 * @version 1.0
 */
public interface ChartSetting {
	public Info getInfo(DHBChartConfigBase config);
	public void saveInfo(Info info, DHBChartConfigBase config);
}
