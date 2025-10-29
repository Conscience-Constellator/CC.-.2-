package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.Q_ChR$;
import CC.$.Q2$_LMNt.Short_Q$;
import java.util.Iterator;

public interface Short_ChR$ extends
	Short_Q$,
	Q_ChR$
{
	Clas_Rap Class=Init_StRt_Nd(Short_ChR$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Short_ChR$(short A,char B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_ChRg$(short[] Ag,char[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Short_ChR$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg_ChRg$(Iterable<Short> Ag,Iterable<Character> Bg)
		{
			Iterator<Short> A_Itr=Ag.iterator();
			Iterator<Character> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Short_ChR$(A_Itr.next(),B_Itr.next());}
		}
}