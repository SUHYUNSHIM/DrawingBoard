package information;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import Frame.MainDesktopPane;
import SubPanel.DrawPanel;
import figure.Figure;
import SubPanel.DrawPanel;
public class Information {
	
	public static final String PROGRAM_NAME ="2019 JAVA DRAWING BOARD TERM PROJECT";
	public static final int PROGRAM_WIDTH = 1280;
	public static final int PROGRAM_HEIGHT = 760;
	
	public static final int MODE_DRAW_REC=1;
	public static final int MODE_DRAW_TRIANGLE=2;
	public static final int MODE_DRAW_CIRCLE=3;
	public static final int MODE_DRAW_LINE=4;
	public static final int MODE_ERASE=5;
	public static final int MODE_TEXT=6;
	public static final int MODE_MOVE=7;
	public static final int MODE_PEN=8;
	public static final int MODE_PAINT=9;
	public static final int MODE_RESIZE=10;
	public static final int MODE_POLYGON = 11;
	
	
	public static final int IS_EMPTY=-1;
	public static final int IS_ERASER=0;
	public static final int IS_FIGURE=1;
	
	private static Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	//ȭ�鿡�� ���콺 Ŀ����� �ٲٱ����� toolkit��ü ��ȯ
	
	//textstyle ������ ���õ� ��Ʈ �ִ±��/��ȯ
	//textsize �ʱⰪ ���ϰ� ������ ���õ� ����� �ִ±��/��ȯ
	//linesize�� ��������� �����س���
	
	//���� ������ü�� ���⿡ ��/��ȯ �ϴ� ���
	//���� drawpanel ��ü�� ���⿡ ��/��ȯ�ϴ� ���
	//���� maindesktoppane ��ü�� ���⿡ ��/��ȯ�ϴ� ���
	
	//�׸��� â�� ��ﶧ���� ������1�� ������Ű�� ���, ī��Ʈ�� ������ ��ȯ�ϴ� ���
	//���� �׸��� ��尡 �������� �� ���̽��� ���� ���ڿ��� ��ȯ
	//���� �׸��� ��尪(int) ��/��ȯ
	
	//���� ������ ��/��ȯ
	
	public static Toolkit getToolkit()
	{
		return toolkit;
	}
	
	
	private static int textStyle=Font.PLAIN;
	
	public static void setTextStyle(int font)
	{
		textStyle=font;
	}
	
	public static int gettextStyle()
	{
		return textStyle;
	}
	
	
	private static int textSize=10;
	
	public static void setTextSize(int size)
	{
		textSize=size;
	}
	
	public static int getTextSize()
	{
		return textSize;
	}
	
	
	private static int LineSize=1;
	
	public static void setLineSize(int size)
	{
		LineSize=size;
	}
	
	public static int getLineSize()
	{
		return LineSize;
	}
	
	
	private static int EraserSize=35;
	
	public static void setEraserSize(int size)
	{
		EraserSize=size;
	}
	
	public static int getEraserSize()
	{
		return EraserSize;
	}
	
	
	
	
	private static Figure currentFigure =null;
	
	public static void setCurrentFigure(Figure cur)
	{
		currentFigure = cur;
		
	}
	public static Figure getCurrentFigure()
	{
		return currentFigure;
	}
	
	private static DrawPanel currentPanel=null;
	private static MainDesktopPane currentMainDesktopPane=null;

	public static void setCurrentpanel(DrawPanel current)
	{
		currentPanel=current;
		
	}
	
	public static DrawPanel getCurrentJPanel()
	{
		return currentPanel;
	}
	
	public static void setCurrentMainDesktopPane(MainDesktopPane current)
	{
		currentMainDesktopPane=current;
		
	}
	
	public static MainDesktopPane getCurrentMainDesktopPane()
	{
		return currentMainDesktopPane;
	}
	
	private static int DrawFrame_Count =1;
	private static int CurrentMode=8;
	
	private static Color currentColor=new Color(255,255,255);
	
	
	public static  int getDrawFrame_Count(){return DrawFrame_Count;}
	public static  void addDrawFrame_Count(){DrawFrame_Count++;}
	
	public static String getCurrentModeToString()
	{
		switch(CurrentMode)
		{
		case MODE_DRAW_REC : return "�簢�� �׸���";
		case MODE_DRAW_TRIANGLE : return "�ﰢ�� �׸���";
		case MODE_DRAW_CIRCLE :  return "�� �׸���";
		case MODE_DRAW_LINE : return "�� �׸���";
		case MODE_ERASE : return "�����";
		case MODE_TEXT : return "�ؽ�Ʈ ����";
		case MODE_MOVE : return "�̵� ���";
		case MODE_PEN : return " �׸���";
		case MODE_PAINT:  return "ä���";
		case MODE_RESIZE : return "�������� ���";
		case MODE_POLYGON : return "���׸��� ���";

		default : return "���õ� ��尡 �����ϴ�.";
		}
		
	}

	public static int getCurrentMode()
	{
		return CurrentMode;
	}
	
	public static void setCurrentMode(int mode)
	{
		CurrentMode=mode;		
	}
	
	public static Color getCurrentColor()
	{
		return currentColor;
	}
	
	public static void setCurrentColor(int R, int G, int B)
	{
		Color changeColor = new Color(R,G,B);
		currentColor= changeColor;
		
	}
	
}