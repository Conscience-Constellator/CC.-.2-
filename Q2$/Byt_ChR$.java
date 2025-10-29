package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Byt_Q$;
import CC.$.Q2$_LMNt.Q_ChR$;

import java.util.Iterator;

public interface Byt_ChR$ extends
		Byt_Q$,
		Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(Byt_ChR$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Byt_ChR$(byte A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_ChRg$(byte[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Byt_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_ChRg$(Iterable<Byte> Ag,Iterable<Character> Bg)
		{
			Iterator<Byte> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Byt_ChR$(A_Itr.next(),B_Itr.next());}
		}
}