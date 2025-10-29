package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.ChR_Q$;
import CC.$.Q2$_LMNt.Q_ChR$;
import java.util.Iterator;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR2$ extends
	ChR_Q$,
	Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(ChR2$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void ChR_ChR$(char A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_ChRg$(char[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){ChR_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg_ChRg$(Iterable<Character> Ag,Iterable<Character> Bg)
		{
			Iterator<Character> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){ChR_ChR$(A_Itr.next(),B_Itr.next());}
		}
}