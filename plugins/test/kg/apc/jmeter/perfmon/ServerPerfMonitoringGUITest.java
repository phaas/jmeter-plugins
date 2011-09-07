package kg.apc.jmeter.perfmon;

import kg.apc.charting.GraphPanelChart;
import kg.apc.jmeter.vizualizers.JSettingsPanel;
import kg.apc.emulators.TestJMeterUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author APC
 */
public class ServerPerfMonitoringGUITest
{
   
   public ServerPerfMonitoringGUITest()
   {
   }

   @BeforeClass
   public static void setUpClass() throws Exception
   {
      TestJMeterUtils.createJmeterEnv();
   }

   @AfterClass
   public static void tearDownClass() throws Exception
   {
   }

   @Before
   public void setUp()
   {
   }

   @After
   public void tearDown()
   {
   }

   @Test
   public void testGetStaticLabel()
   {
      System.out.println("getStaticLabel");
      ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
      String result = instance.getStaticLabel();
      assertTrue(result.length()>0);
   }
   @Test
   public void testGetSettingsPanel()
   {
      System.out.println("getSettingsPanel");
      ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
      JSettingsPanel result = instance.getSettingsPanel();
      assertNotNull(result);
   }

    /**
     * Test of addPerfRecord method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testAddPerfRecord_String_double()
    {
        System.out.println("addPerfRecord");
        String serverName = "test";
        double value = 3.0;
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        instance.addPerfRecord(serverName, value);
    }

    /**
     * Test of addPerfRecord method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testAddPerfRecord_3args()
    {
        System.out.println("addPerfRecord");
        String serverName = "test";
        double value = 3.0;
        long time = 100000L;
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        instance.addPerfRecord(serverName, value, time);
    }

    /**
     * Test of setErrorMessage method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testSetErrorMessage()
    {
        System.out.println("setErrorMessage");
        String msg = "Error message.";
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        instance.setErrorMessage(msg);
    }

    /**
     * Test of clearErrorMessage method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testClearErrorMessage()
    {
        System.out.println("clearErrorMessage");
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        String msg = "Error message.";
        instance.setErrorMessage(msg);
        instance.clearErrorMessage();
    }

    /**
     * Test of setChartType method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testSetChartType()
    {
        System.out.println("setChartType");
        int monitorType = GraphPanelChart.CHART_PERCENTAGE;
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        instance.setChartType(monitorType);
    }

    /**
     * Test of setLoadMenuEnabled method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testSetLoadMenuEnabled()
    {
        System.out.println("setLoadMenuEnabled");
        boolean enabled = false;
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        instance.setLoadMenuEnabled(enabled);
    }

    /**
     * Test of clearData method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testClearData()
    {
        System.out.println("clearData");
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        instance.clearData();
    }

    /**
     * Test of getWikiPage method, of class ServerPerfMonitoringGUI.
     */
    @Test
    public void testGetWikiPage() {
        System.out.println("getWikiPage");
        ServerPerfMonitoringGUI instance = new ServerPerfMonitoringGUI();
        String result = instance.getWikiPage();
        assertTrue(result.length()>0);
    }
}