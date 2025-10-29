package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q2$_LMNt.Q_Byt$;
import CC.$.Q2$_LMNt.Int_Q$;
import java.util.Iterator;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Int_Byt$ extends
	Int_Q$,
	Q_Byt$
{
	Clas_Rap Class=Init_StRt_Nd(Int_Byt$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Int_Byt$(int A,byte B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Bytg$(int[] Ag,byte[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Int_Byt$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Intg_Bytg$(Iterable<Integer> Ag,Iterable<Byte> Bg)
		{
			Iterator<Integer> A_Itr=Ag.iterator();
			Iterator<Byte> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Int_Byt$(A_Itr.next(),B_Itr.next());}
		}
}