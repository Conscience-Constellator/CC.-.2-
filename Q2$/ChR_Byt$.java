package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.ChR_Q$;
import CC.$.Q2$_LMNt.Q_Byt$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR_Byt$ extends ChR_Q$,Q_Byt$
{
	Clas_Rap Class=Init_StRt_Nd(ChR_Byt$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void ChR_Byt$(char A,byte B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Bytg$(char[] Ag,byte[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){ChR_Byt$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_Bytg$(Iterable<Character> Ag,Iterable<Byte> Bg)
		{
			Iterator<Character> A_Itr=Ag.iterator();
			Iterator<Byte> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){ChR_Byt$(A_Itr.next(),B_Itr.next());}
		}
}