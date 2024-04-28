class UpperCaseAlphabet
{
	static int rows=9;
	static int cols=5;
	static CenterScr artist = new CenterScr();
	public static void main(String[] args)
	{
		// CenterScr artist = new CenterScr();
		artist.clrScr();
		artist.clrCenter(14);
		Screen scr = new Screen();
		// artist.centerScr(8);
		char ch='A';
		switch(ch)
		{
			case 'A':
				A();
				// scr.line('*');
				System.out.println();
			case 'B':
				B();
				// scr.line('*');
				System.out.println();
			case 'C':
				C();
				// scr.line('*');
				System.out.println();
			case 'D':
				D();
				// scr.line('*');
				System.out.println();
			case 'E':
				E();
				// scr.line('*');
				System.out.println();
			case 'F':
				F();
				// scr.line('*');
				System.out.println();
			case 'G':
				G();
				// scr.line('*');
				System.out.println();
			case 'H':
				H();
				// scr.line('*');
				System.out.println();
			case 'I':
				I();
				// scr.line('*');
				System.out.println();
			case 'J':
				J();
				// scr.line('*');
				System.out.println();
			case 'K':
				K();
				// scr.line('*');
				System.out.println();
			case 'L':
				L();
				// scr.line('*');
				System.out.println();
			case 'M':
				M();
				// scr.line('*');
				System.out.println();
			case 'N':
				N();
				// scr.line('*');
				System.out.println();
			case 'O':
				O();
				// scr.line('*');
				System.out.println();
			case 'P':
				P();
			// 	scr.line('*');
			case 'Q':
				Q();
				// scr.line('*');
				System.out.println();
			case 'R':
				R();
				// scr.line('*');
				System.out.println();
			case 'S':
				S();
				// scr.line('*');
				System.out.println();
			case 'T':
				T();
				// scr.line('*');
				System.out.println();
			case 'U':
				U();
				// scr.line('*');
				System.out.println();
			case 'V':
				V();
				// scr.line('*');
				System.out.println();
			case 'W':
				W();
				// scr.line('*');
				System.out.println();
			case 'X':
				X();
				// scr.line('*');
				System.out.println();
			case 'Y':
				Y();
				// scr.line('*');
				System.out.println();
			case 'Z':
				Z();
				// scr.line('*');
				System.out.println();
				break;
			default:
				System.out.println("Invalid Alphabet.");
		}
	}
	public static void A()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
				if((i==1 && j==1) || (i==1 && j==cols) )
					System.out.print("  ");
				else if( i==1 || j==1 || j==cols || i==(rows/2)+2)
					System.out.print("* ");
				else
				System.out.print("  ");
			System.out.println();
		}
	}
	public static void B()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==rows/2+1 && j==cols) || (i==1 && j==cols) || (i==rows && j==cols) )
					System.out.print("  ");
				else if(i==1 || i==rows/2+1 || i==rows || j==1 || j==cols)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void C()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				// if((i==1 && j==1) || (i==1 && j==cols) || ((i !=1 && j>rows/3) && (i !=1 && j<rows/3+2)) || (i==rows && j==1) || (i==rows && j==cols))
				if((i==1 && j==1) || (i==1 && j==cols) || ((i>rows/3 && j==cols) && (i<(rows/3)+4 && j==cols)) || (i==rows && j==1) || (i==rows && j==cols))
					System.out.print("  ");
				else if(i==1 || j==1 || j==cols || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void D()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && j==cols) || (i==rows && j==cols))
					System.out.print("  ");
				else if(i==1 || j==1 || j==cols || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void E()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(i==1 || j==1 || i==rows/2+1 || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void F()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(i==1 || j==1 || i==rows/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void G()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && j==1) || (i==1 && j==cols) || ((i>rows/3 && j==cols) && (i<rows/2+2 && j==cols)) || (i==rows/2+1 && j==2) || (i==rows && j==1) || (i==rows && j==cols))
					System.out.print("  ");
				else if(i==1 || j==1 || j==cols || i==rows/2+1 || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void H()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(i==rows/2+1 || j==1 || j==cols)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void I()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(i==1 || j==cols/2+1 || i==rows)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void J()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(i==rows && j==1)
					System.out.print("  ");
				else if(i==1 || j==cols/2+1 || (i>=rows/2+1 && j==1) || (i==rows && j<=cols/2+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void K()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(i<=rows/2+1)
				{
					// dup=cols;
					if(j==1 || j+i==6)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else
				{
					// dup;
					if(j==1 || i-j==4)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void L()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==rows && j!=1) || j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void M()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(j==1 || j==cols || (i<rows/2+1 && j==cols/2+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void N()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=rows; j++)
			{
				if(j==1 || j==i || j==rows)
				// if(j==1 || j==rows || (cols++ != rows))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void O()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && j==1) || (i==1 && j==cols) || (i==rows && j==1) || (i==rows && j==cols))
					System.out.print("  ");
				else if(j==1 || j==cols || i==1 || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void P()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && j==cols) || (i>=rows/2+1 && j==cols))
					System.out.print("  ");
				else if(j==1 || j==cols || i==1 || i==rows/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void Q()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && (j==1 || j==cols)) || (i==rows-2 && (j==1 || j==cols)))
					System.out.print("  ");
				else if(i==1 || (j==1 && i<=rows-2) || (j==cols) || i==rows-2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void R()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && j==cols) || (i==rows/2+1 && j==cols))
					System.out.print("  ");
				else if(j==1 || j==cols || i==1 || i==rows/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void S()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if((i==1 && (j==1 || j==cols)) || (i==rows/2+1 && (j==1 || j==cols)) || (i>rows/2 && j==1) || (i<rows/2+1 && j==cols) || (i==rows && j==cols))
					System.out.print("  ");
				else if(i==1 || i==rows/2+1 || j==1 || j==cols || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void T()
	{
		int cols = 7;
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(j==cols/2+1 || i==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void U()
	{
		cols=7;
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=cols; j++)
			{
				if(i==rows && (j==1 || j==cols))
					System.out.print("  ");
				else if(j==1 || j==cols || i==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void V()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=rows*2; j++)
			{
				if(i==j || i+j==rows*2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void W()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=rows; j++)
			{
				if(j==1 || j==rows)
				{
					System.out.print("* ");
					if(i>rows/2 && (i+j==8))
					{
						System.out.print("* ");
					}
					else
						System.out.print("  ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void X()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=rows*2; j++)
			{
				if(j==i || j+i==rows+1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void Y()
	{
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=rows; j>i; j--)
			{
				if(i+j==rows+1)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	public static void Z()
	{
		int dup=rows;
		for(int i=1; i<=rows; i++)
		{
			artist.centerScr(8);
			for(int j=1; j<=rows; j++)
			{
				if(i==1 || i==rows || j==dup)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			dup--;
			System.out.println();
		}
	}
}